package com.example.stageonda.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Fournisseur {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Long Id;
    public String Nom,Prenom,Email,ICE,IF;
}


