package com.example.sio.ppe4_kaliemie;

import java.util.Date;

public class CategorieSoin {

    private String IDCATEGORIE;
    private String LIBCATEGORIE;
    private String DESCRIPTIONCATEGORIE;
    private Date date;

    public CategorieSoin(String idcategorie, String libcategorie, String descriptioncategorie, Date ladate) {
        this.IDCATEGORIE = idcategorie;
        this.LIBCATEGORIE = libcategorie;
        this.DESCRIPTIONCATEGORIE = descriptioncategorie;
        this.date = ladate;
    }

    public String getIDCATEGORIE() {
        return this.IDCATEGORIE;
    }

    public String getLIBCATEGORIE() {
        return this.LIBCATEGORIE;
    }

    public String getDESCRIPTIONCATEGORIE() {
        return this.DESCRIPTIONCATEGORIE;
    }

    public Date getDate() {
        return this.date;
    }

    public void setIDCATEGORIE(String idcategorie) {
        this.IDCATEGORIE = idcategorie;
    }

    public void setLIBCATEGORIE(String libcategorie) {
        this.LIBCATEGORIE = libcategorie;
    }

    public void setDESCRIPTIONCATEGORIE(String descriptioncategorie) {
        this.DESCRIPTIONCATEGORIE = descriptioncategorie;
    }

    public void setDate(Date ladate) {
        this.date = ladate;
    }
}
