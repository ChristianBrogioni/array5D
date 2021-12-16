package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    ImageView locandina;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        intent= getIntent();
        String titolo= intent.getStringExtra("titolo");

        if(titolo=="interstellar"){
            locandina.setImageResource(R.drawable.interstellar);
        }

        if(titolo=="spiderman_no_way_home"){
            locandina.setImageResource(R.drawable.spiderman_no_way_home);
        }

        if(titolo=="the_lord_of_the_rings"){
            locandina.setImageResource(R.drawable.the_lord_of_the_rings);
        }

        Toast.makeText(getApplicationContext(), titolo, Toast.LENGTH_LONG).show();

}
}