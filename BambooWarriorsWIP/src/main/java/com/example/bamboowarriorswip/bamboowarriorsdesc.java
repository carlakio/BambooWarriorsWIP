package com.example.bamboowarriorswip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bamboowarriorsdesc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bamboowarriorsdesc);

        ImageButton back_Button = findViewById(R.id.back_btn);

        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login_Screen = new Intent(bamboowarriorsdesc.this, MainActivity.class);
                startActivity(login_Screen);
            }

        });
    }
}