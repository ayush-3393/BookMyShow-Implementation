package com.BMSDesign.BMS.models;

import com.BMSDesign.BMS.models.enums.Features;
import jakarta.persistence.*;
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

    @ManyToMany
    private List<Actor> cast;

    private int runTime;
}
