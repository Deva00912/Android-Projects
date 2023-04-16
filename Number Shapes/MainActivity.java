package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Numbershape {

        int shape;
        String message;

        public boolean isSquare() {
            double squareRoot = Math.sqrt(shape);
            if (squareRoot == Math.floor(squareRoot)) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isTriangular() {
            int x = 1;
            int triangularNumber = 1;
            while (triangularNumber < shape) {
                x++;
                triangularNumber += x;
            }

            if (triangularNumber == shape) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void guessShape(View view) {
        Numbershape numbershape = new Numbershape();
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        numbershape.shape = Integer.parseInt(editText.getText().toString());
        System.out.println(numbershape.shape);
        String message = editText.getText().toString() + " is ";

        if(numbershape.isSquare() && numbershape.isTriangular()){
            message += " both Square and Triangular number.";
        } else if (numbershape.isSquare()) {
            message += " a Square number.";

        } else if (numbershape.isTriangular()) {
            message += " a triangular number.";

        } else {
            message = "Please enter a proper shape number!!";
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}