package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
Button btnInserisci;
Button btnInvia;
Gestorebrani gb;
Intent i;
EditText txtDurata;
EditText txtTitolo;
EditText autore;
EditText dataC;
Spinner spnGenere;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInserisci = (Button)findViewById(R.id.btnInserisci);
        btnInvia = (Button) findViewById(R.id.btnInvia);
        gb=new Gestorebrani();
        txtDurata =(EditText)findViewById(R.id.txtDurata);
        txtTitolo = (EditText) findViewById(R.id.txtTitolo);
        autore = (EditText) findViewById(R.id.autore);
        dataC = (EditText) findViewById(R.id.dataC);
        spnGenere = (Spinner) findViewById(R.id.spnGenere);

        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.genere, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnGenere.setAdapter(adapter);





        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date d= null;
                try {
                    d = format.parse(dataC.getText().toString());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                gb.addBrano(txtTitolo.getText().toString(), Integer.parseInt(txtDurata.getText().toString()), autore.getText().toString(), d, spnGenere.getSelectedItem().toString());
            }
        });

        btnInvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainLista.class);
                i.putExtra("messaggio", gb.ListaBrani());
                startActivity(i);
            }
        });
    }
}