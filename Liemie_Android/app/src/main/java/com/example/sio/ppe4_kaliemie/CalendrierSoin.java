package com.example.sio.ppe4_kaliemie;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class CalendrierSoin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendrier_soin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Date d1 = new Date(2016,04,19,8,0);
        Date d2 = new Date(2016,04,19,8,0);
        Date d3 = new Date(2016,04,19,11,0);

        Infirmiere inf1 = new Infirmiere("inf001","Lefol","Gisèle","Carquefou","48 rue des hirondelles","44124", "pouet","lg@gmail.com","0214545425","0654542512",d2);
        Patient p1 = new Patient("p001","Nantes","Girouet","Albert","Nantes","14 ruede la Bastille", "44000","lel","a.g@gmail.com","0245546558","0665548798",d2);
        Visite v1 = new Visite("v001",p1,inf1,d1,d2);
        Patient p2 = new Patient("p002","Carcouet","Camembert","Norbert","Couëron","19 rue des prés", "44116","lel","c.n@gmail.com","0255486554","0754545485",d2);
        Visite v2 = new Visite("v002",p2,inf1,d3,d2);

        ArrayList<Visite> lesVisites = new ArrayList<Visite>();
        lesVisites.add(v1);
        lesVisites.add(v2);

        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        for (Visite uneVisite:lesVisites) {
            String libelle;
            String visite = "Visite " + uneVisite.getIDVISITE();
            String hours ;
            if(uneVisite.getDATEVISITE().getMinutes()== 0)
                hours = "Heure du RDV : " + uneVisite.getDATEVISITE().getHours() + "h" + 00;
            else
                hours = "Heure du RDV : " + uneVisite.getDATEVISITE().getHours() + "h" + uneVisite.getDATEVISITE().getMinutes();

            String patient = "Patient : " + uneVisite.getPATIENT().GetNOM() + " " + uneVisite.getPATIENT().GetPRENOM();
            libelle = visite + "\n" + hours + "\n" + patient;
        }

    }
}
