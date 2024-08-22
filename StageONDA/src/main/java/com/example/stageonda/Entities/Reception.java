package com.example.stageonda.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Reception {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date date;
    public String Type;
    public Integer Num;
    @ManyToOne
    public Contrat contrats;
}
