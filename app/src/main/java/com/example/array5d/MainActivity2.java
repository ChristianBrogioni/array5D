package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    private ListView listView;

    String film[]= {"Interstellar", "La la land", "The lord of the rings"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        listView= (ListView)findViewById(R.id.lvFilm);
        ArrayAdapter<String> itemsAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, film);
        listView.setAdapter(itemsAdapter);


    }
}