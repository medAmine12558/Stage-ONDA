package com.example.stageonda.Services;

import com.example.stageonda.Entities.AO;

import java.util.Optional;

public interface AO_Service {
    public AO saveAO(AO ao);
    public Optional<AO> Select_AO_ID(Long id);
    public AO Update_AO_ID(Long id,AO ao);
    public void Delete_AO(AO ao);
}
