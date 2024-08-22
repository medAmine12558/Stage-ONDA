package com.example.stageonda.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity @AllArgsConstructor @NoArgsConstructor
public class Seance {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String Intitule;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate Date_ouverture;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JsonBackReference
    public AO ao;
}
