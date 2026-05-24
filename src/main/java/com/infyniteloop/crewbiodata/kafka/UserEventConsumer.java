package com.infyniteloop.crewbiodata.kafka;

import com.infyniteloop.crewbiodata.crew.entity.Crew;
import com.infyniteloop.crewbiodata.crew.mapper.CrewMapper;
import com.infyniteloop.crewbiodata.crew.repository.CrewRepository;
import dtos.event.UserEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.BackOff;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class UserEventConsumer {
    private static final Logger LOG = LoggerFactory.getLogger(UserEventConsumer.class);


    private final CrewRepository crewRepository;
    private final CrewMapper crewMapper;


    public UserEventConsumer(CrewRepository crewRepository, CrewMapper crewMapper) {
        this.crewRepository = crewRepository;
        this.crewMapper = crewMapper;
    }

    @RetryableTopic(attempts = "4",
            backOff = @BackOff(delay = 3000, multiplier = 1.5, maxDelay = 15000),
            exclude = {NullPointerException.class})
    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(UserEvent userEvent, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic, @Header(KafkaHeaders.OFFSET) long offset) {

        LOG.info("Consuming user event {} , Topic: {}, Offset: {} " , userEvent.toString(), topic, offset);

        Crew crew = crewMapper.toEntity(userEvent.getUser());
        crewRepository.save(crew);

    }


    @DltHandler
    public void listenDlt(UserEvent userEvent, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic, @Header(KafkaHeaders.OFFSET) long offset ) {
        LOG.info("DLT Received user event {} , Topic: {}, Offset: {} " , userEvent.toString(), topic, offset);
    }
}
