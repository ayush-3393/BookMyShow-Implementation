package com.BMSDesign.BMS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Theater extends BaseModel{
    private String name;
    private String address;

    @ManyToOne
    private City city;

//    @OneToMany
//    private List<Auditorium> auditoriums;
}
