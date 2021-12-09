package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //crea l'actvity
        setContentView(R.layout.activity_main);

        Button btnEsegui= (Button)findViewById(R.id.btnEsegui);

        btnEsegui.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hai premuto il tasto", Toast.LENGTH_LONG).show();

            }
        });
    }
}