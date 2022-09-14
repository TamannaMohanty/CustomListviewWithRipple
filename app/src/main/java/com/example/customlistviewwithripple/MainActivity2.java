package com.example.customlistviewwithripple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img_1;
    TextView countries,capital;
    String countriesStr,capitalStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        countries=findViewById(R.id.countries_txt);
        capital=findViewById(R.id.capital_txt);
        img_1=findViewById(R.id.image_img);

        countriesStr=getIntent().getStringExtra("countrieskey");
        capitalStr=getIntent().getStringExtra("capitalkey");
        int image = getIntent().getIntExtra("imagekey",0);
        img_1.setImageResource(image);


        countries.setText(""+countriesStr);
        capital.setText(""+capitalStr);


    }
}