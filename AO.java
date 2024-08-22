package com.example.stageonda.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity  @NoArgsConstructor @AllArgsConstructor @Data
public class AO {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String Desc,Objet;
    public float Prix;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date date;
    @ManyToOne
    public Res_achat user;
}
