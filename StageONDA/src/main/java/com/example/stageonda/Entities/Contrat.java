package com.example.stageonda.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public Integer Duree;
    public Float Prix;
    @OneToOne
    @JsonBackReference
    public AO ao;
    @OneToMany(mappedBy = "contrats", cascade = CascadeType.MERGE)
    public List<Reception> receptions=new ArrayList<>();
    @OneToMany(mappedBy = "contrats" , cascade = CascadeType.MERGE)
    public List<Order_service> orderServices=new ArrayList<>();
}
