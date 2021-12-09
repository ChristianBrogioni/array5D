package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEsegui= (Button)findViewById(R.id.btnEsegui);

        btnEsegui.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });
    }
}