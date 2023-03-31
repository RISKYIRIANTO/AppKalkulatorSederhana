package com.example.kalkulator;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText angka1,angka2;
    Button res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = findViewById(R.id.edittext);
        angka2 = findViewById(R.id.edittext2);
        res = findViewById(R.id.button1);

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bil1 = Integer.parseInt(angka1.getText().toString());
                int bil2 = Integer.parseInt(angka2.getText().toString());

                int sum = bil1 +bil2;

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("key", sum);
                startActivity(intent);
            }
        });
    }
}