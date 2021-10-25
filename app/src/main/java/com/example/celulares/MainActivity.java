package com.example.celulares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void xiaomi(View view){
        Intent xiaomi = new Intent(this,Xiaomi.class);
        startActivity(xiaomi);
    }
    public void lg(View view){
        Intent lg = new Intent(this,Lg.class);
        startActivity(lg);
    }
    public void oppo(View view){
        Intent oppo = new Intent(this,Oppo.class);
        startActivity(oppo);
    }
    public void iphone(View view){
        Intent iphone = new Intent(this,Iphone.class);
        startActivity(iphone);
    }
    public void samsung(View view){
        Intent samsung = new Intent(this,Samsung.class);
        startActivity(samsung);
    }
    public void motorola(View view){
        Intent motorola = new Intent(this,Motorola.class);
        startActivity(motorola);
    }

}