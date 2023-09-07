package com.BMSDesign.BMS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MovieShow extends BaseModel{

    @ManyToOne
    @JoinColumn(name = "auditorium_id")
    private Auditorium auditorium;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    private Date start_time;
    private Date end_time;

}
