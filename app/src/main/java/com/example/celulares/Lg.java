package com.example.celulares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lg);
    }
    public void atras(View view){
        Intent atras = new Intent(this,MainActivity.class);
        startActivity(atras);
    }
}