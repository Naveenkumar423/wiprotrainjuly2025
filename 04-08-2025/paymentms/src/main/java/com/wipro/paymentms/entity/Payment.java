package com.wipro.paymentms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Payment {
    @Id
    private int orderId;
    private boolean paymentStatus;
}
