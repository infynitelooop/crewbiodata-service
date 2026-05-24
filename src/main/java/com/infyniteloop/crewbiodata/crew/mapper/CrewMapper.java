package com.infyniteloop.crewbiodata.crew.mapper;


import com.infyniteloop.crewbiodata.crew.dto.CrewRequest;
import com.infyniteloop.crewbiodata.crew.dto.CrewResponse;
import com.infyniteloop.crewbiodata.crew.entity.Crew;
import dtos.UserEventDto;
import dtos.event.UserEvent;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface CrewMapper {
    CrewResponse toDto(Crew crew);
    Crew toEntity(CrewRequest dto);

    @Mapping(target = "crewId", source = "userName")
    Crew toEntity(UserEventDto userEventDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(CrewRequest dto, @MappingTarget Crew crew);
}
