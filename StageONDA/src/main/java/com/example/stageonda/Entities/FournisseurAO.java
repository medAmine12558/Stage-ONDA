package com.example.stageonda.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class FournisseurAO {


    @EmbeddedId
    public FournisseurAOID id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate Date_postuler;
    public Float Mantant_fournisseur;
    @ManyToOne
    @MapsId("AoId")
    @JoinColumn(name = "Ao_id")
    @JsonBackReference
    public AO ao;
    @ManyToOne
    @MapsId("FournisseurId")
    @JoinColumn(name = "fournisseur_id")
    @JsonBackReference
    public Fournisseur fournisseur;
}
