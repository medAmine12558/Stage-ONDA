package com.example.stageonda.Controllers;

import com.example.stageonda.Entities.AO;
import com.example.stageonda.Entities.Seance;
import com.example.stageonda.Entities.Utilisateur;
import com.example.stageonda.Services.AO_Service_Imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AO_controller {
    @Autowired
    AO_Service_Imp aoServiceImp;

    @GetMapping("/Amine")
        public List<Seance> Amine(){
            return aoServiceImp.Select_AO_ID(1L).get().Seances;
        }

}
