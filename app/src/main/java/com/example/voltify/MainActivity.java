package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btnInserisci;
EditText txtTitolo;
Gestorebrani gb;
Button btnInvia;
EditText txtDurata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInserisci = (Button)findViewById(R.id.btnInserisci);
        txtTitolo = (EditText) findViewById(R.id.txtTitolo);
        btnInvia = (Button) findViewById(R.id.btnInvia);
        txtDurata =(EditText)findViewById(R.id.txtDurata);
        gb=new Gestorebrani();


        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.addBrano(txtTitolo.getText().toString(),Integer.parseInt(txtDurata.getText().toString()));
            }
        });
    }
}