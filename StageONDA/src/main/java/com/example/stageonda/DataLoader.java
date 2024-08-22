package com.example.stageonda;

import com.example.stageonda.Entities.*;
import com.example.stageonda.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;


@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    public Utilisateur_Repo utilisateurRepo;
    @Autowired
    public Role_Repo roleRepo;
    @Autowired
    public AO_Repo aoRepo;
    @Autowired
    public Seance_Repo seanceRepo;
    @Autowired
    public Contrat_Repo contratRepo;
    @Autowired
    public Fournisseur_Repo fournisseurRepo;
    @Autowired
    public FournissueurAO_Repo fournissueurAORepo;
    @Override
    public void run(String... args) throws Exception {
//        Role r=new Role();
//        r.name="user";
//        Role r1=new Role();
//        r1.name="admin";
//        Role r2=new Role();
//        r2.name="comite";
//        roleRepo.save(r);
//        roleRepo.save(r1);
//        roleRepo.save(r2);
//        Utilisateur u=new Utilisateur("Mohamed Amine","Elazziz","Amine@gmail.com","Amine");
//        Utilisateur u=utilisateurRepo.findById(2L).get();
//        u.roles=Arrays.asList(roleRepo.findById(2L).get());
//        utilisateurRepo.save(u);
//
////        //Ajouter des AOs
//        AO ao=new AO();
//        ao.Descrip="Cette offre est l'ai la pour demmander des materilles informatique pour le securite des resaux locaux (Fire wall,Ips)";
//        ao.Objet="Materille du securite informatique";
//        ao.Prix= 3000.00F;
//        LocalDate D=LocalDate.of(2024,8,22);
//        ao.date=D;
//        ao.utilisateur=utilisateurRepo.findById(2L).get();
//        Seance S =new Seance();
//        S.Intitule="Z";
//        S.Date_ouverture=LocalDate.of(2024,8,22);
//        seanceRepo.save(S);
//        Contrat c=new Contrat();
//        c.Duree=3;
//        c.Prix=4000.5F;
//        contratRepo.save(c);
//        ao.Seances=Arrays.asList(S);
//        ao.contrat=c;
//        aoRepo.save(ao);
//        S.ao=ao;
//        seanceRepo.save(S);
//        c.ao=ao;
//        contratRepo.save(c);
//
//        // Ajouter un fournisseur
//        Fournisseur f=new Fournisseur();
//        f.Nom="Aymane";
//        f.Prenom="moukil";
//        f.Email="Aymane@gmail.com";
//        f.ICE="Z";
//        f.IF1="X";
//        fournisseurRepo.save(f);
//        FournisseurAO fao=new FournisseurAO();
//        FournisseurAOID faoid= new FournisseurAOID();
//        faoid.AoId=ao.id;
//        faoid.FournisseurId=f.Id;
//        fao.ao=ao;
//        fao.fournisseur=f;
//        fao.Date_postuler=LocalDate.of(2024,9,4);
//        fao.Mantant_fournisseur=2000.0F;
//        fao.id=faoid;
//        fournissueurAORepo.save(fao);
////
//        //afficher les AO
   }
}
