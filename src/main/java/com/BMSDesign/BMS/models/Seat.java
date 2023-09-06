package com.BMSDesign.BMS.models;

import com.BMSDesign.BMS.models.enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Seat extends BaseModel{
    private String number;
    private int rowNum;
    private int colNum;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    @ManyToOne
    @JoinColumn(name = "auditorium_id")
    private Auditorium auditorium;
}
