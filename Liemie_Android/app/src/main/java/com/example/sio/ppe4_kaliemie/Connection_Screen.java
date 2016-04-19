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

        if(false)
        {
            mThreadCon = new Async (Connection_Screen.this).execute(URL_RecupererInfirmiereParLogin);
        }

    }

    private View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Modele unModele = new Modele();

            i = new Intent(getApplicationContext(), Main_Menu.class);
            startActivity(i);
        }
    };


}
