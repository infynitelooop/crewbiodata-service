package com.infyniteloop.crewbiodata.crew.mapper;


import com.infyniteloop.crewbiodata.crew.dto.CrewRequest;
import com.infyniteloop.crewbiodata.crew.dto.CrewResponse;
import com.infyniteloop.crewbiodata.crew.entity.Crew;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CrewMapper {
    CrewResponse toDto(Crew crew);
    Crew toEntity(CrewRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(CrewRequest dto, @MappingTarget Crew crew);
}
