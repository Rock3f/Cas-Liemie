package com.example.sio.ppe4_kaliemie;

import java.util.Date;

public class Soin {

    private String IDSOIN;
    private String IDTYPESOIN;
    private String LIBSOIN;
    private String DESCRIPTIONSOIN;
    private Date date;

    public Soin(String idsoin, String idtypesoin, String libsoin, String descriptionsoin, Date ladate)
    {
        this.IDSOIN = idsoin;
        this.IDTYPESOIN = idtypesoin;
        this.LIBSOIN = libsoin;
        this.DESCRIPTIONSOIN = descriptionsoin;
        this.date = ladate;
    }

    public void setIDSOIN(String idsoin)
    {
        this.IDSOIN = idsoin;
    }
    public void setIDTYPESOIN(String idtypesoin)
    {
        this.IDTYPESOIN = idtypesoin;
    }
    public void setLIBSOIN(String libsoin)
    {
        this.LIBSOIN = libsoin;
    }
    public void setDESCRIPTIONSOIN(String descriptionsoin)
    {
        this.DESCRIPTIONSOIN = descriptionsoin;
    }
    public void setDate(Date laDate)
    {
        this.date = laDate;
    }

    public String getIDSOIN()
    {
        return this.IDSOIN;
    }
    public String getIDTYPESOIN()
    {
        return this.IDTYPESOIN;
    }
    public String getLIBSOIN()
    {
        return this.LIBSOIN;
    }
    public String getDESCRIPTIONSOIN()
    {
        return this.DESCRIPTIONSOIN;
    }
    public Date getDate()
    {
        return this.date;
    }
}
