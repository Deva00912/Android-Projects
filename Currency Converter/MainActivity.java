package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText editText = (EditText)findViewById(R.id.editTextNumberDecimal);

        String Pounds = editText.getText().toString();
        double pounds = Double.parseDouble(Pounds);
        double dollars = pounds * 1.3;
        String Dollars = String.format("%.2f",dollars);

        Toast.makeText(this, "$" + Dollars, Toast.LENGTH_LONG).show();
//        Log.i("Amount", Dollars );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}