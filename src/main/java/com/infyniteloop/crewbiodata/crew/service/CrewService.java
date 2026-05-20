package com.infyniteloop.crewbiodata.crew.service;

import com.infyniteloop.crewbiodata.crew.dto.CrewRequest;
import com.infyniteloop.crewbiodata.crew.dto.CrewResponse;
import jakarta.transaction.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CrewService {
    CrewResponse createCrew(CrewRequest dto);

    CrewResponse getCrew(String crewId);

    List<CrewResponse> getAllCrews();

    CrewResponse updateCrew(String crewId, CrewRequest dto);

    void deleteCrew(String crewId);

    @Transactional
    void importFromCsv(MultipartFile file);
}
