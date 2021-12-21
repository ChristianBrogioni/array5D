package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    ImageView locandina;
    Intent intent;

    int[] arrayImmagini = {
            R.drawable.interstellar,
            R.drawable.spiderman_no_way_home,
            R.drawable.the_lord_of_the_rings,
    };

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        locandina= (ImageView) findViewById(R.id.imageView);

        intent= getIntent();
        int posizione= intent.getIntExtra("posizione", 0);
        locandina.setImageResource(arrayImmagini[posizione]);


}
}