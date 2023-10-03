package com.BMSDesign.BMS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Actor extends BaseModel{
    private String name;
    private String gender;

    @ManyToMany
    private List<Movie> movies;
}
