package com.example.bamboowarriorswip;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class merchandise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchandise);

        //Button checkout_btn = findViewById(R.id.merchbag_btn);
        Button addtocart_btn = findViewById(R.id.addtocart_btn);
        TextView merchbag = findViewById(R.id.merch_bag_incr);

        EditText qty_input_keychain = findViewById(R.id.qty_input_keychain);
        EditText qty_input_bambootop = findViewById(R.id.qty_input_bambootop);
        EditText qty_input_icedcoffee = findViewById(R.id.qty_input_icedcoffee);
        EditText qty_input_bamboocap = findViewById(R.id.qty_input_bamboocap);

        // Initialize a variable to keep track of the count
        final int[] itemCount = {0};

        addtocart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String keychain = qty_input_keychain.getText().toString();
                String bambootop = qty_input_bambootop.getText().toString();
                String icedcoffee = qty_input_icedcoffee.getText().toString();
                String bamboocap = qty_input_bamboocap.getText().toString();

                Integer KC = Integer.parseInt(keychain);
                Integer BT = Integer.parseInt(bambootop);
                Integer IC = Integer.parseInt(icedcoffee);
                Integer BC = Integer.parseInt(bamboocap);

                Integer addtocart = KC + BT + IC + BC;
                Integer reset = 0;
                itemCount[0] += addtocart; // Increment the count

                merchbag.setText(String.valueOf(itemCount[0])); // Update the TextView with the new count
                qty_input_keychain.setText(reset.toString());
                qty_input_bambootop.setText(reset.toString());
                qty_input_icedcoffee.setText(reset.toString());
                qty_input_bamboocap.setText(reset.toString());

                Toast.makeText(merchandise.this, addtocart + " items added to cart", Toast.LENGTH_SHORT).show();
            }
        });

    }
}