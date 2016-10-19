package com.example.a1432581.dinolistviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DinoInfo extends AppCompatActivity {
    ImageView image;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dino_info);
        Intent i = getIntent();
        Dinosaur d = i.getParcelableExtra("Dino");


        image = (ImageView)findViewById(R.id.about_dino_img);
        tv = (TextView)findViewById(R.id.about_dino_text);

        image.setImageResource(d.getDrawable());
        tv.setText(d.getName());

    }
}
