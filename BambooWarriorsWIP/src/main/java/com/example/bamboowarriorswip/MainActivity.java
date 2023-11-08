package com.example.bamboowarriorswip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button_Login = findViewById(R.id.button_Login);
        ImageButton contactUs_btn = findViewById(R.id.contactUs_btn);
        ImageButton bambooWarriors_btn = findViewById(R.id.bambooWarriors_btn);
        ImageButton merch_btn = findViewById(R.id.merchandise_btn);
        ImageButton ourEmblem_btn = findViewById(R.id.ourEmblem_btn);

        contactUs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactUs = new Intent(MainActivity.this, contactUs.class);
                startActivity(contactUs);
            }

        });
        bambooWarriors_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bambooWarriors = new Intent(MainActivity.this, bamboowarriorsdesc.class);
                startActivity(bambooWarriors);
            }

        });
        merch_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent merchandise = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(merchandise);
            }

        });
        ourEmblem_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ourEmblem = new Intent(MainActivity.this, ouremblemdesc.class);
                startActivity(ourEmblem);
            }

        });


        ImageButton seeMore_btn = findViewById(R.id.seeMore_btn);

        seeMore_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent seeMore = new Intent(MainActivity.this, seemoredesc.class);
                startActivity(seeMore);
            }

        });



        button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login_Screen = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(login_Screen);
            }

        });
    }
}