package com.BMSDesign.BMS.models;

import com.BMSDesign.BMS.models.enums.Features;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Auditorium extends BaseModel{
    private String number;

    private int maxRows;
    private int maxCols;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Features> supportedFeatures;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;

    @OneToMany
    private List<Seat> seats;
}
