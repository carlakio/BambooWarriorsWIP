package com.example.bamboowarriorswip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class contactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);


        ImageButton back_Button = findViewById(R.id.back_btn);
        ImageButton submit_Button = findViewById(R.id.send_message_btn);

        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login_Screen = new Intent(contactUs.this, MainActivity.class);
                startActivity(login_Screen);
            }

        });

        submit_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessageSentDialog();
            }

        });
    }

    private void showMessageSentDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Message sent!")
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // You can add code here to handle the button click
                    }
                });

        // Create and show the dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}