package com.example.ryan.numberwiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManVSMachineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_vsmachine);
    }
    public void hVa(View view){
        Intent human = new Intent(this, Human_VS_AI_Activity.class);
        startActivity(human);
    }
    public void aVh(View view){
        Intent ai = new Intent(this, AI_VS_Human_Activity.class);
        startActivity(ai);
    }
}

