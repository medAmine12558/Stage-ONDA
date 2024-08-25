package com.example.stageonda.Services;

import com.example.stageonda.Entities.AO;

import java.util.List;
import java.util.Optional;

public interface AO_Service {
    public AO saveAO(AO ao);
    public List<AO> SelectAll();
    public Optional<AO> Select_AO_ID(Long id);
    public AO Update_AO_ID(Long id,AO ao);
    public void Delete_AO_ID(Long id);
}
