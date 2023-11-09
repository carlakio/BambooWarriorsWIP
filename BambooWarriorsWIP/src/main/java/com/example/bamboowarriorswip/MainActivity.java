package com.example.bamboowarriorswip;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

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
        ImageButton settings_btn = findViewById(R.id.settings_btn);

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

        settings_btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    showMessageSentDialog();
            }
        });


    }

    private void showCustomDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.overlay_settings, (ViewGroup) findViewById(R.id.custom_dialog_container));

        // Adjust width and height of the dialog
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        dialogView.setLayoutParams(params);

        builder.setView(dialogView)
                .setTitle("Custom Dialog Example")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        final AlertDialog dialog = builder.create();

        // Set click listeners for the buttons in your custom dialog
        dialogView.findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for button 1 click
                dialog.dismiss();
            }
        });

        dialogView.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for button 2 click
                dialog.dismiss();
            }
        });

        dialogView.findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for button 3 click
                dialog.dismiss();
            }
        });

        dialogView.findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for button 4 click
                dialog.dismiss();
            }
        });

        dialog.show();
    }



}