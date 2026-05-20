package com.infyniteloop.crewbiodata.crew.mapper;

import com.infyniteloop.crewbiodata.crew.dto.CrewRequest;
import com.infyniteloop.crewbiodata.crew.dto.CrewResponse;
import com.infyniteloop.crewbiodata.crew.entity.Crew;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-20T23:43:03+1000",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Oracle Corporation)"
)
@Component
public class CrewMapperImpl implements CrewMapper {

    @Override
    public CrewResponse toDto(Crew crew) {
        if ( crew == null ) {
            return null;
        }

        String crewId = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String fathersName = null;
        String gender = null;
        LocalDate dateOfBirth = null;
        String mobileNumber = null;
        String address = null;
        String permanentAddress = null;
        String maritalStatus = null;
        String bloodGroup = null;
        String emergencyContactNumber = null;
        String designation = null;
        String crewType = null;
        String orgType = null;
        String hqCode = null;
        String cadre = null;

        crewId = crew.getCrewId();
        firstName = crew.getFirstName();
        middleName = crew.getMiddleName();
        lastName = crew.getLastName();
        fathersName = crew.getFathersName();
        gender = crew.getGender();
        dateOfBirth = crew.getDateOfBirth();
        mobileNumber = crew.getMobileNumber();
        address = crew.getAddress();
        permanentAddress = crew.getPermanentAddress();
        maritalStatus = crew.getMaritalStatus();
        bloodGroup = crew.getBloodGroup();
        emergencyContactNumber = crew.getEmergencyContactNumber();
        designation = crew.getDesignation();
        crewType = crew.getCrewType();
        orgType = crew.getOrgType();
        hqCode = crew.getHqCode();
        cadre = crew.getCadre();

        CrewResponse crewResponse = new CrewResponse( crewId, firstName, middleName, lastName, fathersName, gender, dateOfBirth, mobileNumber, address, permanentAddress, maritalStatus, bloodGroup, emergencyContactNumber, designation, crewType, orgType, hqCode, cadre );

        return crewResponse;
    }

    @Override
    public Crew toEntity(CrewRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Crew crew = new Crew();

        crew.setCrewId( dto.crewId() );
        crew.setFirstName( dto.firstName() );
        crew.setMiddleName( dto.middleName() );
        crew.setLastName( dto.lastName() );
        crew.setFathersName( dto.fathersName() );
        crew.setGender( dto.gender() );
        crew.setDateOfBirth( dto.dateOfBirth() );
        crew.setMobileNumber( dto.mobileNumber() );
        crew.setAddress( dto.address() );
        crew.setPermanentAddress( dto.permanentAddress() );
        crew.setMaritalStatus( dto.maritalStatus() );
        crew.setBloodGroup( dto.bloodGroup() );
        crew.setEmergencyContactNumber( dto.emergencyContactNumber() );
        crew.setDesignation( dto.designation() );
        crew.setCrewType( dto.crewType() );
        crew.setOrgType( dto.orgType() );
        crew.setHqCode( dto.hqCode() );
        crew.setCadre( dto.cadre() );

        return crew;
    }

    @Override
    public void updateEntityFromDto(CrewRequest dto, Crew crew) {
        if ( dto == null ) {
            return;
        }

        if ( dto.crewId() != null ) {
            crew.setCrewId( dto.crewId() );
        }
        if ( dto.firstName() != null ) {
            crew.setFirstName( dto.firstName() );
        }
        if ( dto.middleName() != null ) {
            crew.setMiddleName( dto.middleName() );
        }
        if ( dto.lastName() != null ) {
            crew.setLastName( dto.lastName() );
        }
        if ( dto.fathersName() != null ) {
            crew.setFathersName( dto.fathersName() );
        }
        if ( dto.gender() != null ) {
            crew.setGender( dto.gender() );
        }
        if ( dto.dateOfBirth() != null ) {
            crew.setDateOfBirth( dto.dateOfBirth() );
        }
        if ( dto.mobileNumber() != null ) {
            crew.setMobileNumber( dto.mobileNumber() );
        }
        if ( dto.address() != null ) {
            crew.setAddress( dto.address() );
        }
        if ( dto.permanentAddress() != null ) {
            crew.setPermanentAddress( dto.permanentAddress() );
        }
        if ( dto.maritalStatus() != null ) {
            crew.setMaritalStatus( dto.maritalStatus() );
        }
        if ( dto.bloodGroup() != null ) {
            crew.setBloodGroup( dto.bloodGroup() );
        }
        if ( dto.emergencyContactNumber() != null ) {
            crew.setEmergencyContactNumber( dto.emergencyContactNumber() );
        }
        if ( dto.designation() != null ) {
            crew.setDesignation( dto.designation() );
        }
        if ( dto.crewType() != null ) {
            crew.setCrewType( dto.crewType() );
        }
        if ( dto.orgType() != null ) {
            crew.setOrgType( dto.orgType() );
        }
        if ( dto.hqCode() != null ) {
            crew.setHqCode( dto.hqCode() );
        }
        if ( dto.cadre() != null ) {
            crew.setCadre( dto.cadre() );
        }
    }
}
