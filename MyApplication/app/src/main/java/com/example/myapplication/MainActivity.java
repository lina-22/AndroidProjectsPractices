package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNbPizzas ;
    Button idBtEnvoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNbPizzas = (EditText) findViewById(R.id.idEtNbPizzas);
        idBtEnvoyer = (Button) findViewById(R.id.idBtEnvoyer);
    }

    public void envoyer(View vue) {
        String nbPizzasSaisies = etNbPizzas.getText().toString();
        String message = new String("nombre de pizzas = "+" "+nbPizzasSaisies);
        Bundle paquet = new Bundle();
        paquet.putString("nbPizzas", nbPizzasSaisies);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        //Intent intentEnvoyer = new Intent(this, ActiviteSecondaire.class);
        //intentEnvoyer.putExtras(paquet);
       // startActivity(intentEnvoyer);
    }


}