package com.example.sio.ppe4_kaliemie;

import java.util.Date;

/**
 * Created by SIO on 17/03/2016.
 */
public class Patient {
    private String ID;
    private String LIEURESIDENCE;
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

    public Patient(String id, String lieu, String nom, String prenom, String ville, String rue, String cp, String mdp, String mail, String fixe, String portable, Date DATE)
    {
        this.ID = id;
        this.LIEURESIDENCE = lieu;
        this.NOM = nom;
        this.PRENOM = prenom;
        this.VILLE = ville;
        this.RUE = rue;
        this.CP = cp;
        this.MDP = mdp;
        this.MAIL = mail;
        this.FIXE = fixe;
        this.PORTABLE =portable;
        this.date = DATE;
    }

    public void SetID(String id){
        this.ID = id;
    }

    public void SetNOM(String nom){
        this.NOM = nom;
    }

    public void SetLIEURESIDENCE(String lieu){
        this.LIEURESIDENCE = lieu;
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

    public String GetLIEURESIDENCE(){
        return this.LIEURESIDENCE;
    }
}
