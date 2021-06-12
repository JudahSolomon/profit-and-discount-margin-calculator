package com.example.profitdiscountcalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.airbnb.lottie.parser.IntegerParser;
import com.example.profitdiscountcalc.databinding.ActivityMainBinding;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

   private ActivityMainBinding binder;
   private String option;
   private String finalValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         binder = DataBindingUtil.setContentView(this, R.layout.activity_main);
         binder.invalidateAll();


        String[] profit_discount = {"PROFIT", "DISCOUNT"};
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                R.layout.support_simple_spinner_dropdown_item, profit_discount);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        binder.spinner.setAdapter(adapter);

        binder.calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (option.equals(profit_discount[0])){
                    finalValue = profitPercentageToActualAmount();

                }
                if(option.equals(profit_discount[1])){
                    finalValue=discountPercentageToActualAmount();
                }

                binder.displayTotal.setText(String.valueOf(finalValue));
            }
        });


        binder.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

               String valueOfSelectedItem =  (String) parent.getItemAtPosition(position);

                option = valueOfSelectedItem;
                System.out.println(profit_discount[0]);
                System.out.println(valueOfSelectedItem);
                System.out.println(profit_discount[1]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
                  }



            // CREATING THE PROFIT PERCENTAGE CALCULATING METHOD
            public String profitPercentageToActualAmount() {

                String amount = binder.amountEntered.getText().toString();
                String percentage = binder.percentageEntered.getText().toString();
                int per_to_amount = parseInt(amount) + (parseInt(percentage) * parseInt(amount)) / 100;
                System.out.println(per_to_amount);
                return String.valueOf(per_to_amount);

            }



    public String discountPercentageToActualAmount(){
        String amount = binder.amountEntered.getText().toString();
        String percentage = binder.percentageEntered.getText().toString();
        int per_to_amount = parseInt(amount) - (parseInt(percentage) * parseInt(amount)) / 100;
        return String.valueOf(per_to_amount);

       // System.out.println("discount selected");

    }


}
