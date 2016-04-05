package com.example.sio.ppe4_kaliemie;

import android.os.Environment;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by SIO on 07/03/2016.
 */
public class Modele {
    private String db4oFileName;
    private ObjectContainer dataBase;
    private File appDir;

    public Modele() {
        createDirectory();
        open();
        // si partie import non développée
        dataBase.close();
    }

    public void open() {

        db4oFileName = Environment.getExternalStorageDirectory() + "/baseDB4o" + "/BaseKaliemie.db4o";
        dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), db4oFileName);
    }

    public void createDirectory() {
        appDir = new File(Environment.getExternalStorageDirectory() + "/baseDB4o");

        if (!appDir.exists() && !appDir.isDirectory()) {
            appDir.mkdirs();
        }
    }
}
