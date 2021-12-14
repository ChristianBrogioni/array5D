package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnEsegui;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEsegui= (Button)findViewById(R.id.btnEsegui);

        btnEsegui.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                i= new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}