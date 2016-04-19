package com.example.sio.ppe4_kaliemie;

import java.util.ArrayList;

/**
 * Created by temp on 19/04/2016.
 */
public class SoinPratiquer {
    private Visite visite;
    private ArrayList<Soin> lesSoins;
    private String prevu;
    private String effectue;

    public SoinPratiquer(Visite laVisite, ArrayList<Soin> soins, String Prevu, String Effectue)
    {
        this.visite = laVisite;
        this.lesSoins = soins;
        this.prevu = Prevu;
        this.effectue = Effectue;
    }

    public Visite GetVisite()
    {
        return this.visite;
    }

    public ArrayList<Soin> GetLesSoins()
    {
        return  this.lesSoins;
    }

    public String getPrevu()
    {
        return this.prevu;
    }

    public  String getEffectue()
    {
        return  this.effectue;
    }

    public void setEffectue(String e)
    {
        this.effectue = e;
    }

    public  void setVisite (Visite v)
    {
        this.visite = v;
    }

    public  void setPrevu(String p)
    {
        this.prevu = p;
    }

}
