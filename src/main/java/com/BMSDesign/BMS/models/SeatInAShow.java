package com.BMSDesign.BMS.models;

import com.BMSDesign.BMS.models.enums.SeatStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SeatInAShow extends BaseModel {

    @Enumerated(EnumType.ORDINAL)
    private SeatStatus seatStatus;

    @ManyToOne
    private Seat seat;

    @ManyToOne
    private MovieShow movieShow;

    private Date lockedAt;
}