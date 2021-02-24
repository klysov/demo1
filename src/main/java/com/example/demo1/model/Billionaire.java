package com.example.demo1.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "billionaires")
public class Billionaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String career;

}
