package com.infyniteloop.crewbiodata.crew.dto;

import com.infyniteloop.crewbiodata.crew.entity.Address;
import com.infyniteloop.crewbiodata.crew.entity.Phone;
import enums.CrewType;
import enums.Gender;
import enums.MaritalStatus;
import jakarta.persistence.Column;

import java.time.LocalDate;
import java.util.List;

public record CrewRequest(
        String crewId,
        String firstName,
        String middleName,
        String lastName,
        String fathersName,
        Gender gender,
        LocalDate dateOfBirth,
        List<Phone> phoneNumber,
        List<Address> address,
        String permanentAddress,
        MaritalStatus maritalStatus,
        String bloodGroup,
        String emergencyContactNumber,
        String designation,
        CrewType crewType,
        String orgType,
        String lobby,
        String division,
        String zone,
        String hq,
        String cadre
) {}
