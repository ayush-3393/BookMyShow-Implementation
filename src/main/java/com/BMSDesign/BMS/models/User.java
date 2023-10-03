package com.BMSDesign.BMS.models;

import com.BMSDesign.BMS.models.enums.Role;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class User extends BaseModel{
    private String name;
    private String username;
    private String password;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Role> roles;

    private String phoneNumber;
}
