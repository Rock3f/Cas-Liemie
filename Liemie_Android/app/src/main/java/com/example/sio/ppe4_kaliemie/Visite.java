package com.example.sio.ppe4_kaliemie;


import java.util.Date;

public class Visite {

    private String IDVISITE;
    private Patient PATIENT;
    private Infirmiere INFIRMIERE;
    private Date DATEVISITE;
    private Date dateMaj;


    public Visite(String idvisite, Patient patient, Infirmiere inf, Date datemaj, Date datevisite) {
        this.IDVISITE = idvisite;
        this.PATIENT = patient;
        this.INFIRMIERE = inf;
        this.dateMaj = datemaj;
        this.DATEVISITE = datevisite;
    }

    public String getIDVISITE() {
        return this.IDVISITE;
    }

    public Patient getPATIENT() {
        return this.PATIENT;
    }

    public Infirmiere getINF() {
        return this.INFIRMIERE;
    }

    public Date getDATEVISITE() {
        return this.DATEVISITE;
    }

    public Date getDateMaj() {
        return this.dateMaj;
    }

    public void setIDVISITE(String idvisite) {
        this.IDVISITE = idvisite;
    }

    public void setPATIENT(Patient patient) {
        this.PATIENT = patient;
    }

    public void setINF(Infirmiere inf) {
        this.INFIRMIERE = inf;
    }

    public void setDATEVISITE(Date datevisite) {
        this.DATEVISITE = datevisite;
    }

    public void setDateMaj(Date datemaj) {
        this.dateMaj = datemaj;
    }
}
