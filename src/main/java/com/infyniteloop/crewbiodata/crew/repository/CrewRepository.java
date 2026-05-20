package com.infyniteloop.crewbiodata.crew.repository;

import com.infyniteloop.crewbiodata.crew.entity.Crew;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrewRepository extends JpaRepository<Crew, String> {}
