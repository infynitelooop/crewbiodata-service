package com.infyniteloop.crewbiodata.crew.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;

    String streetAddress;
    String city;
    String state;
    String zip;
    String country;
    boolean isPermanent;

    @ManyToOne(fetch = FetchType.LAZY)
    // defines the foreign key name in this table
    @JoinColumn(name = "crew_id")
    @JsonBackReference
    Crew crew;

}
