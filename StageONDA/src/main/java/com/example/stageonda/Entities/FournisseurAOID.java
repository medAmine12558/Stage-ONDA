package com.example.stageonda.Entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class FournisseurAOID implements Serializable {
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
