package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void calculate(View view){
        EditText loanMoney = (EditText) findViewById(R.id.loanMoney);
        int emiAmount = Integer.parseInt(loanMoney.getText().toString());

        EditText rate = (EditText) findViewById(R.id.rateOfInterest);
        int emiRate = Integer.parseInt(rate.getText().toString());

        int i =1;
        double rateOf = (double)emiRate/12/100;

        do {
            int numberOfMonths =12*i*5;
            double amount = (emiAmount * rateOf * Math.pow((1 + rateOf),numberOfMonths))/(Math.pow((1 + rateOf),numberOfMonths)-1);

            TextView emiView= (TextView) findViewById(R.id.textView1);
            emiView.append("EMI payment " + amount + "\n");
            i++;
        }while(i<=6);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}