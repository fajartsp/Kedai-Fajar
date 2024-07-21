package com.example.fajar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton btnFood = findViewById(R.id.imageButton);
        ImageButton btnCoffee = findViewById(R.id.imageButton2);
        ImageButton btnDrink = findViewById(R.id.imageButton4);
        ImageButton btnSnack = findViewById(R.id.imageButton5);

        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke SecondActivity
                startActivity(new Intent(Home.this, foodact.class));
            }
        });
        btnCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke SecondActivity
                startActivity(new Intent(Home.this, coffeeact.class));
            }
        });
        btnDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke SecondActivity
                startActivity(new Intent(Home.this, drinkact.class));
            }
        });
        btnSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke SecondActivity
                startActivity(new Intent(Home.this, snackact.class));
            }
        });
    }
}