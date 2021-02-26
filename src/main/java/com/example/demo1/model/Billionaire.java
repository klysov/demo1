package com.example.demo1.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "billionaires")
public class Billionaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String career;

}
