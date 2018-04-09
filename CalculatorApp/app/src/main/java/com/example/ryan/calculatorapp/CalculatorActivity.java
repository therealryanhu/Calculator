package com.example.ryan.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private EditText input;
    private TextView output;
    private int container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
    public static int addition (int a, int b){
        int ans = a + b;
        return ans;
    }
// documentation for methods:
// 1 = (variable, variable, etc.)- what to return
// 2 = explain the use of the method
// 3 = requirements: what is not allowed for the method ex. b != 0 (optional)
// 4 = example code with what it will return ex. methodName(int) -> int

    /**
     *(a,b) -> ans
     * Add two numbers together to get a sum.
     * NO REQ
     * >>> addition(1,2)
     * 3
     */

    public static int subtraction (int a, int b){
        int ans = a - b;
        return ans;
    }

    /**
     * (a,b)-> ans
     * Subtract two numbers to get a difference.
     * REQ: a > b
     * >>> subtraction(2,1)
     * 1
     */

    public  static int multiplication (int a, int b){
        int ans = a * b;
        return ans;
    }

    /**
     * (a,b) -> ans
     * Multiply two numbers to get a product.
     * NO REQ
     * >>> multiplication(1,2)
     * 2
     */

    public static int division (int a, int b){
        int ans = a / b;
        return ans;
    }

    /**
     * (a,b) -> ans
     * Divide two numbers to get a quotient.
     * REQ: a || b != 0
     * REQ: a > b
     * >> division(2,1)
     * 2
     */

    public static int factorials (int a){
        /**
         * (a) -> ans
         * Get the factorial of one number.
         * REQ: a cannot be a negative number
         * >>> factorials(4)
         * 24
         */
        int ans;
        if (a < 2){
            ans = 1;
        }
        else {
            ans = a* factorials(a-1);
        }
        return ans;
    }

    public void add(View view) {
        input = findViewById(R.id.editText);
        output = findViewById(R.id.output);
        Editable n1 = input.getText();
        input.setText(String.valueOf(0));
        container += Integer.parseInt(String.valueOf(n1));
        output.setText(String.valueOf(container));
    }


    public void subtract(View view) {
        input = findViewById(R.id.editText);
        output = findViewById(R.id.output);
        Editable n1 = input.getText();
        input.setText(String.valueOf(0));
        container -= Integer.parseInt(String.valueOf(n1));
        output.setText(String.valueOf(container));
    }

    public void division(View view) {
        input = findViewById(R.id.editText);
        output = findViewById(R.id.output);
        Editable n1 = input.getText();
        input.setText(String.valueOf(0));
        container = container / Integer.parseInt(String.valueOf(n1));
        output.setText(String.valueOf(container));
    }

    public void multiplication(View view) {
        input = findViewById(R.id.editText);
        output = findViewById(R.id.output);
        Editable n1 = input.getText();
        input.setText(String.valueOf(0));
        container = container * Integer.parseInt(String.valueOf(n1));
        output.setText(String.valueOf(container));
    }

    public void factorials(View view) {
        input = findViewById(R.id.editText);
        output = findViewById(R.id.output);
        Editable n1 = input.getText();
        input.setText(String.valueOf(0));
        container = factorials(container);
        output.setText(String.valueOf(container));
    }

    public void equal(View view) {
    }

    public void Cl(View view) {
        input = findViewById(R.id.editText);
        output = findViewById(R.id.output);
        Editable n1 = input.getText();
        output.setText(String.valueOf(0));
        container = 0;
        output.setText(String.valueOf(container));
    }
}
