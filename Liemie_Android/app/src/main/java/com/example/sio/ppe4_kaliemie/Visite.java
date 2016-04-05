package com.example.sio.ppe4_kaliemie;


import java.util.Date;

public class Visite {

    private String IDVISITE;
    private String IDPATIENT;
    private String IDINF;
    private Date DATEVISITE;
    private Date dateMaj;


    public Visite(String idvisite, String idpatient, String idinf, Date datemaj, Date datevisite) {
        this.IDVISITE = idvisite;
        this.IDPATIENT = idpatient;
        this.IDINF = idinf;
        this.dateMaj = datemaj;
        this.DATEVISITE = datevisite;
    }

    public String getIDVISITE() {
        return this.IDVISITE;
    }

    public String getIDPATIENT() {
        return this.IDPATIENT;
    }

    public String getIDINF() {
        return this.IDINF;
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

    public void setIDPATIENT(String idpatient) {
        this.IDPATIENT = idpatient;
    }

    public void setIDINF(String idinf) {
        this.IDINF = idinf;
    }

    public void setDATEVISITE(Date datevisite) {
        this.DATEVISITE = datevisite;
    }

    public void setDateMaj(Date datemaj) {
        this.dateMaj = datemaj;
    }
}
