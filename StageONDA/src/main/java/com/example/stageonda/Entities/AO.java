package com.example.stageonda.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity  @NoArgsConstructor @AllArgsConstructor @Data
public class AO {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String Descrip,Objet;
    public Float Prix;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate date;
    @ManyToOne(cascade = CascadeType.MERGE)
    public Utilisateur utilisateur;
    @OneToMany(mappedBy = "ao" , cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    public List<Seance> Seances=new ArrayList<>();
    @OneToOne(cascade = CascadeType.MERGE)
    public Contrat contrat;
    @OneToMany(mappedBy = "ao")
    private List<FournisseurAO> fournisseurAOs;
}
