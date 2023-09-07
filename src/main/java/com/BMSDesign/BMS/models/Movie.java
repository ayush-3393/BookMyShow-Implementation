package com.BMSDesign.BMS.models;

import com.BMSDesign.BMS.models.enums.Features;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie extends BaseModel{
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Features> requiredFeatures;

//    private List<Actor> actors;

    private int runTime;
}
