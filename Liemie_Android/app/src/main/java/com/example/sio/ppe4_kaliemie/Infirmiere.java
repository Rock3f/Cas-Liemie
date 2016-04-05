package com.example.sio.ppe4_kaliemie;

import java.util.Date;

/**
 * Created by SIO on 07/03/2016.
 */
public class Infirmiere {
    private String ID;
    private String NOM;
    private String PRENOM;
    private String VILLE;
    private String RUE;
    private String CP;
    private String MDP;
    private String MAIL;
    private String FIXE;
    private String PORTABLE;
    private Date date;

    public Infirmiere(String Id, String Nom, String Prenom, String Ville, String Rue, String Cp, String Mdp, String Mail, String Fixe, String Portable, Date DateTime) {
        this.ID = Id;
        this.NOM = Nom;
        this.PRENOM = Prenom;
        this.VILLE = Ville;
        this.RUE = Rue;
        this.CP = Cp;
        this.MDP = Mdp;
        this.MAIL = Mail;
        this.FIXE = Fixe;
        this.PORTABLE =Portable;
        this.date = DateTime;
    }

    public void SetID(String id){
        this.ID = id;
    }

    public void SetNOM(String nom){
        this.NOM = nom;
    }

    public void SetPRENOM(String prenom){
        this.PRENOM = prenom;
    }

    public void SetVILLE(String ville){
        this.VILLE = ville;
    }

    public void SetRUE(String rue){
        this.RUE = rue;
    }

    public void SetCP(String cp){
        this.CP = cp;
    }

    public void SetMAIL(String mail){
        this.MAIL = mail;
    }

    public void SetFIXE(String fixe){
        this.FIXE = fixe;
    }

    public void SetPORTABLE(String portable){
        this.PORTABLE = portable;
    }

    public void SetDATE(Date DATE){
        this.date = DATE;
    }

    public String GetID(){
        return this.ID;
    }

    public String GetNOM(){
        return this.NOM;
    }

    public String GetPRENOM(){
        return this.PRENOM;
    }

    public String GetVILLE(){
        return this.VILLE;
    }

    public String GetRUE(){
        return this.RUE;
    }

    public String GetCP(){
        return this.CP;
    }

    public String GetMAIL(){
        return this.MAIL;
    }

    public String GetFIXE(){
        return this.FIXE;
    }

    public String GetPORTABLE(){
        return this.PORTABLE;
    }

    public String GetMDP() {
        return  this.MDP;
    }
    public Date GetDATE(){
        return this.date;
    }
}
