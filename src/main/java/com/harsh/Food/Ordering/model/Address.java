package com.harsh.Food.Ordering.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String city; // made this at address error
    private String district;// made this at address error

    private String state;// made this at address error




}
