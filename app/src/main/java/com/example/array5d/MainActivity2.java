package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    private ListView listView;
    Intent intent;

    String film[]= new String[] {"interstellar", "spiderman_no_way_home", "the_lord_of_the_rings"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        listView= (ListView)findViewById(R.id.lvFilm);
        ArrayAdapter<String> itemsAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, film); //popola con i dati, decide il layout
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String titolo= (String)listView.getItemAtPosition(position);
                Log.d("errori_nostri","posizione: " + position);
                //Toast.makeText(getApplicationContext(), titolo, Toast.LENGTH_LONG).show();

                intent= new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("titolo", titolo);
                startActivity(intent);
            }
        });


    }
}