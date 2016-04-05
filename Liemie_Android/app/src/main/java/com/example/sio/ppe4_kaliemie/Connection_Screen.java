package com.example.sio.ppe4_kaliemie;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

public class Connection_Screen extends AppCompatActivity {

    private Intent i;
    private String URL_RecupererInfirmiereParLogin = "http://kaliemieppe4.16mb.com/importRecupererInfirmieres.php";
    private AsyncTask<String, String, Boolean> mThreadCon = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection__screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnConnect = (Button) findViewById(R.id.btnConnect);
        btnConnect.setOnClickListener(btnClick);

        if(////////base vide//////////)
        {
            mThreadCon = new Async (Connection_Screen.this).execute(URL_RecupererInfirmiereParLogin);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_connection__screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Modele unModele = new Modele();

            i = new Intent(getApplicationContext(), Main_Menu.class);
            startActivity(i);
        }
    };

    public void retourAsync(StringBuilder s)
    {
        try {
            JSONArray jsonArr = new JSONArray(s);           //On créer un tableau contenant le tableau json s

            while (i < jsonArr.length())                    //On va parcouirr chaque cellule de ce tableau
            {
                JSONObject jsonObj = jsonArr.getJSONObject(i);      //Pour y récupérer tous les objets
        Infirmiere InfirmiereConnectee = new Infirmiere(jsonObj.getString("ID",
                jsonObj.getString("ID",
                jsonObj.getString("ID",

                        /////// ICIIIIIIIIIIIIIIIIIIIIIIIIIIII
                )
            }
            }
            catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
    }
}
