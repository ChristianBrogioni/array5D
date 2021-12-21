package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button esegui;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        esegui= (Button)findViewById(R.id.esegui);

        esegui.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                i= new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}