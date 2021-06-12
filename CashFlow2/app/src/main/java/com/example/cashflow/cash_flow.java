package com.example.cashflow;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

import static android.widget.Toast.*;

public class cash_flow extends AppCompatActivity {
    private TextView you_Have;
    private TextView increase;
    private Button increase_Button;
    private TextView reset;
    private TextView show_Info;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        you_Have = findViewById(R.id.you_Have);
        increase = findViewById(R.id.increase);
        increase_Button = findViewById(R.id.increase_Button);
        reset = findViewById(R.id.reset);
        //show_Info = findViewById(R.id.show_Info);




        }

        @SuppressLint("ResourceAsColor")
        public void setIncrease_Button(View view){
        counter +=1000;
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
            increase.setText(String.valueOf(numberFormat.format(counter)));

            switch (counter){
                case 3000:
                    increase.setTextColor(R.color.teal_700);
                    break;

                case 6000:
                    increase.setCompoundDrawablePadding(R.color.purple_700);
                    break;
                case 9000:
                    increase.setTextColor(R.color.black);
                    break;

                case 1000:
                    increase.setTextColor(R.color.design_default_color_secondary_variant);
                    break;
                default:
            }
    }

    public void setReset(){
        increase.setText(String.valueOf(counter=0));
    }


        public void reset(View view){
        setReset();
            Toast.makeText(this, "You Have Successfully Reset Your Amount", LENGTH_LONG).show();


        }



    public void showInfo(View view){


        }


}