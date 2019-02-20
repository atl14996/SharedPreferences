package com.example.weektwodaytwohomework;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private static final String TAG = "0";
    TextView tvMake;
TextView tvModel;
TextView tvYear;
TextView tvTitleStatus;
TextView tvColor;
TextView tvEngine;
TextView tvTransmission;
private String Make;
private String Model;
private String Year;
private String TitleStatus;
private String Color;
private String Engine;
private String Transmission;
SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
tvMake = findViewById(R.id.tvMake);
tvModel = findViewById(R.id.tvModel);
tvYear = findViewById(R.id.tvYear);
tvTitleStatus = findViewById(R.id.tvTitleStatus);
tvColor = findViewById(R.id.tvColor);
tvEngine = findViewById(R.id.tvEngine);
tvTransmission = findViewById(R.id.tvTransmission);
sharedPreferences = getSharedPreferences("shared_pref", MODE_PRIVATE);
        Log.d(TAG, sharedPreferences.getString("make", ""));
        Log.d(TAG, sharedPreferences.getString("model",""));
        Log.d(TAG, sharedPreferences.getString("year",""));
        Log.d(TAG, sharedPreferences.getString("TitleStatus",""));
        Log.d(TAG, sharedPreferences.getString("color", ""));
        Log.d(TAG, sharedPreferences.getString("engine", ""));
        Log.d(TAG, sharedPreferences.getString("transmission", ""));

Intent cardata = getIntent();

Car car = cardata.getParcelableExtra("object");

Make = car.getMake();
Model = car.getModel();
Year = car.getYear();
TitleStatus = car.getTitleStatus();
Color = car.getColor();
Engine = car.getEngine();
Transmission = car.getTransmission();

tvMake.setText(Make);
tvModel.setText(Model);
tvYear.setText(Year);
tvTitleStatus.setText(TitleStatus);
tvColor.setText(Color);
tvEngine.setText(Engine);
tvTransmission.setText(Transmission);

    }


}
