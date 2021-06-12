package com.example.makeitrain;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity<Snackbar> extends AppCompatActivity {
private Button make_it_rain;
private Button showInfo;
private TextView money_value;
private double moneyCounter = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        make_it_rain = findViewById(R.id.make_it_rain);
        showInfo = findViewById(R.id.showInfo);
        money_value = findViewById(R.id.money_value);

        //  CREATING AN ONCLICK LISTINER FOR THE MKE IT RAIN BUTTON
       // make_it_rain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Main", "You clicked me");
//            }
//        }); SETT

    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public void showMoney(View view) {
        //Log.d("Make it rain", "make_it_rain: You clicked me");
        moneyCounter += 1000;
        // CALLING THE NUMBER FORMAT PACKAGE
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        money_value.setText(String.valueOf(numberFormat.format(moneyCounter)));
    }

    public void app_Name(View view){
        Toast.makeText(this, "Get Rich Quick",Toast.LENGTH_LONG).show();

    }

}