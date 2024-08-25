package com.example.stageonda.Services;

import com.example.stageonda.Entities.AO;
import com.example.stageonda.Repo.AO_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
            ao1.setDescrip(ao.getDescrip());
            ao1.setObjet(ao.getObjet());
            ao1.setDate(ao.getDate());
            ao1.setPrix(ao.getPrix());
            ao1.setUtilisateur(ao.getUtilisateur());
            ao1.setSeances(ao.getSeances());
            ao1.setContrat(ao.getContrat());
            return aoRepo.save(ao1);
        }
        return null;
    }

    @Override
    public void Delete_AO_ID(Long id) {
        aoRepo.deleteById(id);
    }
    @Override
    public List<AO> SelectAll(){
        return aoRepo.findAll();
    }
}
