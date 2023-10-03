package com.BMSDesign.BMS.models;

import com.BMSDesign.BMS.models.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SeatTypeInAShow extends BaseModel{
    @Enumerated
    private SeatType seatType;

    @ManyToOne
    private MovieShow movieShow;

    private Double price;
}
