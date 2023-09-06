package com.BMSDesign.BMS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class City extends BaseModel{
    private String name;

    @OneToMany(mappedBy = "city")
    List<Theater> theaterList;
}
