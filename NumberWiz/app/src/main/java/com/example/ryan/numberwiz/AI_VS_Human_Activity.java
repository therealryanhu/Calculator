package com.example.ryan.numberwiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class AI_VS_Human_Activity extends AppCompatActivity {
    int guess = -1;
    int guessesDone = 0;
    EditText guessEt;
    TextView ind;
    Random random = new Random();
    int num = random.nextInt(100) + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai__vs__human_);
    }
    public String Bye(int gu){
        String result = "";
        result = "Guess my number! It's in between 1 and 100 (including 1 and 100).";
        //guess = input.nextInt();
        if (gu > num){
            result = "Too high! Try lower.";
        }
        if (gu < num){
            result = "Too low! Try higher.";
        }
        if (gu == num){
            if (num == 1){
                result = "Congrats, you won!\nIt took you"+ guessesDone + "guess!";
            }
            result = "Congrats, you won!\nIt took you "+ guessesDone + " guesses!";
        }
        if (gu <= 0){
            result = "That's out of the limit.";
        }
        if (this.guess >= 100){
            result = "That's out of the limit.";
        }
        //System.out.println("Congrats! You won!");
        //System.out.println("It took you " + guessesDone + " guesses.");
        return result;
    }
    public void OKbutton(View view){
        guessesDone ++;
        guessEt = findViewById(R.id.EditText1);
        ind = findViewById(R.id.indicator);
        String mystr = String.valueOf(guessEt.getText());
        guess = Integer.parseInt(mystr);
        mystr = Bye(guess);
        ind.setText(mystr);
    }
}
