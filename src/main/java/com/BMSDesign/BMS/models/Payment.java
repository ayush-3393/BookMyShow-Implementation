package com.BMSDesign.BMS.models;

import com.BMSDesign.BMS.models.enums.PaymentMode;
import com.BMSDesign.BMS.models.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment extends BaseModel{

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;

    @OneToOne
    private Ticket ticket;

    private Double amount;
    private Date paymentTime;
}
