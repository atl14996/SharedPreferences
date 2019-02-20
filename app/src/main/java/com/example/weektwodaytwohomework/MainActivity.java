package com.example.weektwodaytwohomework;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText carMake;
    EditText carModel;
    EditText carYear;
    EditText carTitleStatus;
    EditText carColor;
    EditText carEngine;
    EditText carTransmission;
    public String Make;
    public String Model;
    public String Year;
    public String TitleStatus;
    public String Color;
    public String Engine;
    public String Transmission;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carMake = findViewById(R.id.carmake);
        carModel = findViewById(R.id.carmodel);
        carTitleStatus = findViewById(R.id.cartitlestatus);
        carColor = findViewById(R.id.carcolor);
        carEngine = findViewById(R.id.carengine);
        carTransmission = findViewById(R.id.cartransmission);



    }

    public void onClick (View v){

        Bundle bundle = new Bundle();
        Intent transmit = new Intent(this, ResultActivity.class);
        Make = carMake.getText().toString();
        Model = carModel.getText().toString();
        Year = carYear.getText().toString();
        TitleStatus = carTitleStatus.getText().toString();
        Color = carColor.getText().toString();
        Engine = carEngine.getText().toString();
        Transmission = carTransmission.getText().toString();
        bundle.putParcelable("object", new Car(Make, Model, Year, TitleStatus, Color, Engine, Transmission));
transmit.putExtras(bundle);
SharedPreferences.Editor editor = sharedPreferences.edit();
editor.putString("make", Make);
editor.putString("model", Model);
editor.putString("year", Year);
editor.putString("TitleStatus", TitleStatus);
editor.putString("color", Color);
editor.putString("engine", Engine);
editor.putString("transmission", Transmission);
editor.commit();
startActivity(transmit);
    }
}
