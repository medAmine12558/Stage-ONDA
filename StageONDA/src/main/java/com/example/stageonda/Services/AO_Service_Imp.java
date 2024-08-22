package com.example.stageonda.Services;

import com.example.stageonda.Entities.AO;
import com.example.stageonda.Repo.AO_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AO_Service_Imp implements AO_Service {
    @Autowired
    public AO_Repo aoRepo;
    @Override
    public AO saveAO(AO ao) {
        return aoRepo.save(ao);
    }

    @Override
    public Optional<AO> Select_AO_ID(Long id) {
        return aoRepo.findById(id);
    }

    @Override
    public AO Update_AO_ID(Long id,AO ao) {
        AO ao1=aoRepo.findById(id).get();
        if(ao1 != null){
            ao1.Descrip=ao.Descrip;
            ao1.Objet=ao.Objet;
            ao1.date=ao.date;
            ao1.Prix=ao.Prix;
            ao1.utilisateur=ao.utilisateur;
            ao1.Seances=ao.Seances;
            ao1.contrat=ao.contrat;
            return aoRepo.save(ao1);
        }
        return null;
    }

    @Override
    public void Delete_AO(AO ao) {
        aoRepo.delete(ao);
    }
}
