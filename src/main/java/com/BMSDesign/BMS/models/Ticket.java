package com.BMSDesign.BMS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ticket extends BaseModel{

    @ManyToOne
    private User user;

    private Double amount;

    @OneToMany
    private List<SeatInAShow> seatInAShowList;

    private Date bookingTime;

    @OneToOne
    private Payment payment;
}
