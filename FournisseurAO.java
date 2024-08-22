/*package com.example.stageonda.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class FournisseurAO {

    @Embeddable @NoArgsConstructor @AllArgsConstructor
    private class FournisseurAOID implements Serializable {
        public Long AoId;
        public Long FournisseurId;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FournisseurAOID that = (FournisseurAOID) o;
            return AoId.equals(that.AoId) && FournisseurId.equals(that.FournisseurId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(AoId, FournisseurId);
        }

    }


    @EmbeddedId
    public FournisseurAOID id;
    public Date Date_postuler;
    public Float Mantant_fournisseur;
    @ManyToOne
    @MapsId("AoId")
    @JoinColumn(name = "Ao_id")
    private AO ao;
    @ManyToOne
    @MapsId("FournisseurId")
    @JoinColumn(name = "fournisseur_id")
    public Fournisseur fournisseur;
}
*/