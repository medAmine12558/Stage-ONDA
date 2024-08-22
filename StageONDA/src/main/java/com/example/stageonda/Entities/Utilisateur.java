package com.example.stageonda.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public  class Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String nom,prenom,email,password;

    public Utilisateur(String nom, String prenom, String email, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
    }

    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    public List<Role> roles=new ArrayList<>();
}
