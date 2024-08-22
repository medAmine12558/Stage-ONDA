package com.example.stageonda.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable=false, unique=true)
    public String name;
    @ManyToMany(mappedBy="roles")
    @JsonBackReference
    public List<Utilisateur> utilisateurs;
    public Role(Long id,String n){
        this.id=id;
        this.name=n;
    }
}
