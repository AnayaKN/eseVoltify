package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainLista extends AppCompatActivity {
    TextView t;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista);
        i= getIntent();
        t=(TextView) findViewById(R.id.t);
        t.setText(i.getStringExtra("messaggio"));
    }
}