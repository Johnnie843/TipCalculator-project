package com.example.johnniecooper.tipcalculator_counter.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.johnniecooper.tipcalculator_counter.R;

import org.w3c.dom.Text;

public class TipDisplayActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip_activity);
        TextView tip = (TextView) findViewById(R.id.tip);
        Intent intent = getIntent();
        tip.setText(intent.getStringExtra("tipAmount"));

        ImageButton exit = (ImageButton) findViewById(R.id.exit);
        ImageButton replay = (ImageButton) findViewById(R.id.replay);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent backToCalculator = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(backToCalculator);
            }
        });
    }
}
