package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton=findViewById(R.id.rollbutton);
        final ImageView leftDice=findViewById(R.id.image_leftDice);
        final ImageView rightDice=findViewById(R.id.image_rightDice);
        final int a[]={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","The button has been pressed");
                Random randomNumberGenerator=new Random();
                int n=randomNumberGenerator.nextInt(6);//between 0 and 5
                Log.d("Dicee","The random number:"+n);
                leftDice.setImageResource(a[n]);
                int m=randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(a[m]);

            }
        });

    }
}
