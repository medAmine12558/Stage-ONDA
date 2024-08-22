package com.example.stageonda.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity  @NoArgsConstructor @AllArgsConstructor
public class AO {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter @Setter
    private String Descrip,Objet;
    @Getter @Setter
    private Float Prix;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Getter @Setter
    private LocalDate date;
    @ManyToOne(cascade = CascadeType.MERGE)
    @Getter @Setter
    private Utilisateur utilisateur;
    @OneToMany(mappedBy = "ao" , cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @Getter @Setter
    private List<Seance> Seances=new ArrayList<>();
    @OneToOne(cascade = CascadeType.MERGE)
    @Getter @Setter
    private Contrat contrat;
    @OneToMany(mappedBy = "ao")
    @Getter @Setter
    private List<FournisseurAO> fournisseurAOs;
}
