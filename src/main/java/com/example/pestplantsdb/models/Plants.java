package com.example.pestplantsdb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "plants")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plants {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "culturename")
    private String culturename;
    @Column(name = "pestname")
    private String pestname;
    @Column(name = "effiquencyname")
    private String effiquencyname;
    @Column(name = "phasename")
    private String phasename;
}

