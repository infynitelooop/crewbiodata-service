package com.infyniteloop.crewbiodata.crew.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import enums.CrewType;
import enums.MaritalStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "crew")
@Getter
@Setter
public class Crew {
    @Id
    @Column(length = 10, nullable = false)
    private String crewId;

    @Column(length = 30, nullable = false)
    private String firstName;

    @Column(length = 30)
    private String middleName;

    @Column(length = 30, nullable = false)
    private String lastName;

    @Column(length = 30)
    private String fathersName;

    @Column(length = 10)
    private String gender;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "crew")
    @JsonManagedReference
    private List<Phone> phoneNumber;

    @OneToMany(mappedBy = "crew")
    @JsonManagedReference
    private List<Address> address;

    @Column(length = 10)
    private MaritalStatus maritalStatus;

    @Column(length = 3)
    private String bloodGroup;

    @Column(length = 12)
    private String emergencyContactNumber;

    @Column(length = 30)
    private String designation;

    private CrewType crewType;   // Loco, Guard, etc.

    @Column(length = 20)
    private String orgType;

    @Column(length = 20)
    private String lobby;

    @Column(length = 20)
    private String division;

    @Column(length = 20)
    private String zone;

    @Column(length = 20)
    private String hq;

    @Column(length = 1)
    private String cadre;

}
