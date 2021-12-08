package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String nazioni[]= {"Italia", "Francia", "Germania", "Olanda"}; //attributo di tipo array (array di stringhe)
    ListView listaStati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //crea l'actvity
        setContentView(R.layout.activity_main);

        listaStati= (ListView)findViewById(R.id.lvStati);
        ArrayAdapter<String> aaStati= new ArrayAdapter<String>(this, R.layout.activity_main, nazioni);
        listaStati.setAdapter(aaStati);
    }
}