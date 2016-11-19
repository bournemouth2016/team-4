package com.example.damilola.zombiekiller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ZombieKiller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zombie_killer);
    }

    Button locationBtn = (Button) findViewById(R.id.locBtn);
    Button travelBtn = (Button) findViewById(R.id.travBtn);
    Button lavatoryBtn = (Button) findViewById(R.id.lavBtn);
    Button receptionBtn = (Button) findViewById(R.id.recepBtn);
    Button emServBtn = (Button) findViewById(R.id.emServBtn);
    Button lostBtn = (Button) findViewById(R.id.lostBtn);

    locationBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Tell user what to do!
        }
    });

    travelBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Tell user what to do!
        }
    });

    lavatoryBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Tell user what to do!
        }
    });

    receptionBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Tell user what to do!

        }

    });

    emServBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Tell user what to do!

        }

    });

    lostBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Tell user what to do!

        }

    });
}
