package com.example.bamboowarriorswip;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

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
                Intent merchandise = new Intent(MainActivity.this, merchandise.class);
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
                Intent Login = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(Login);
            }

        });



        // sample action listener for button
        settings_btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    showDialog();
            }
        });


    }

    private void showDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottom_sheet_layout);


        Button AccountLayout = dialog.findViewById(R.id.Account_Button);
        Button ProfileLayout = dialog.findViewById(R.id.Profile_Button);
        Button PasswordLayout = dialog.findViewById(R.id.Password_Button);
        Button PrivacyLayout = dialog.findViewById(R.id.Privacy_Button);

        AccountLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent catalouge = new Intent(MainActivity.this, catalouge.class );
                startActivity(catalouge);
            }
        });
        ProfileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Profile is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        PasswordLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Password Confirmation sent", Toast.LENGTH_SHORT).show();
            }
        });
        PrivacyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Privacy is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));
        dialog.getWindow().getAttributes().windowAnimations = R.style.dialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }

    // dialog alert
    /*private void showCustomDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.overlay_settings, null);

        // Adjust width and height of the dialog
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        dialogView.setLayoutParams(params);

        builder.setView(dialogView)
                .setTitle("Settings")
                .setNegativeButton("Back", new DialogInterface.OnClickListener() {
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
    }*/



}