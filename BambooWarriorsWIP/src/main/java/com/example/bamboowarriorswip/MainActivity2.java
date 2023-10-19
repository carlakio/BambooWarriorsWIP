package com.example.bamboowarriorswip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton back_Button = findViewById(R.id.back_Button);

        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login_Screen = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(login_Screen);
            }

        });

        ImageButton login_Button2 = findViewById(R.id.login_Button);

        login_Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent welcome_Screen = new Intent(MainActivity2.this, loginscreen_loading.class);
                startActivity(welcome_Screen);
            }

        });
    }
}