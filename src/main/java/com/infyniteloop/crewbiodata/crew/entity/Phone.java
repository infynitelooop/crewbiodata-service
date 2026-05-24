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
@Table(name = "phone")
@Getter
@Setter
public class Phone {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(length = 10)
    private String number;

    @Column(length = 10)
    private String areaCode;

    @Column(length = 10)
    private String countryCode;

    @ManyToOne(fetch = FetchType.LAZY)
    // defines the foreign key name in this table
    @JoinColumn(name = "crew_id")
    @JsonBackReference
    private Crew crew;
}
