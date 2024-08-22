package com.example.stageonda.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Order_service {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date date;
    public String Type;
    public Float Mantant;
    @ManyToOne
    public Contrat contrats;
}
