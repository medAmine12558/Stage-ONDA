package com.example.stageonda.Controllers;


import com.example.stageonda.Entities.AO;
import com.example.stageonda.Entities.Seance;

import com.example.stageonda.Services.AO_Service_Imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
        @PostMapping("/update")
    public AO update_desc(@RequestBody Map<String , Object> data){
        String Sid=(String)data.get("id");
        Long id =Long.valueOf(Sid);
        AO ao=aoServiceImp.Select_AO_ID(id).get();

        for(String key:data.keySet()){
            if(key=="description"){
                ao.setDescrip(String.valueOf(data.get("description")));
                aoServiceImp.saveAO(ao);
            } else if (key=="objet") {
                ao.setObjet(String.valueOf(data.get("objet")));
                aoServiceImp.saveAO(ao);
            } else if (key=="date") {
                String Sdate=String.valueOf(data.get("date"));
                LocalDate date=LocalDate.parse(Sdate);
                ao.setDate(date);
                aoServiceImp.saveAO((ao));
            } else if (key=="prix") {
                String Sprix=String.valueOf(data.get("prix"));
                Float prix=Float.valueOf(Sprix);
                ao.setPrix(prix);
                aoServiceImp.saveAO(ao);
            }
        }
            System.out.println(data.get("id"));

        return null;
        }
        @PostMapping("/save")
    public AO save(@RequestBody Map<String,Object> data){
            AO ao=new AO();
            ao.setDescrip(String.valueOf(data.get("descrip")));
            ao.setObjet(String.valueOf(data.get("objet")));
            String Sdate=String.valueOf(data.get("date"));
            LocalDate date=LocalDate.parse(Sdate);
            ao.setDate(date);
            String Sprix=String.valueOf(data.get("prix"));
            Float prix=Float.valueOf(Sprix);
            ao.setPrix(prix);
            aoServiceImp.saveAO(ao);
        return null;
        }


}
