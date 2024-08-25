package com.example.stageonda.Controllers;


import com.example.stageonda.Entities.AO;
import com.example.stageonda.Entities.Seance;

import com.example.stageonda.Services.AO_Service_Imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AOs")
public class AO_controller {
    @Autowired
    AO_Service_Imp aoServiceImp;

    @GetMapping("")
        public List<AO> Amine(){
            return aoServiceImp.SelectAll();
        }
        @GetMapping("/{id}")
    public AO detaile(@PathVariable Long id){
            return aoServiceImp.Select_AO_ID(id).get();
        }

        @CrossOrigin(origins = "http://localhost:5173")
        @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
             aoServiceImp.Delete_AO_ID(id);
        }
//        @PostMapping("/Update/{id}")
//        public AO Add_AO(Long id){
//            AO ao=aoServiceImp.Select_AO_ID(id).get();
//            if(ao!=null){
//
//            }
//        }


}
