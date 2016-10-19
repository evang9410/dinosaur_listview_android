package com.example.a1432581.dinolistviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dinosaur dinosaurs[] = new Dinosaur[]{
                new Dinosaur("Cryolophosaurus",R.drawable.cryolophosaurus),
                new Dinosaur("Giganotosaurus", R.drawable.giganotosaurus),
                new Dinosaur("Paralititan", R.drawable.paralititan),
                new Dinosaur("Parasaurolophus",R.drawable.parasaurolophus),
                new Dinosaur("Supersaurus", R.drawable.supersaurus)

        };
        DinosaurAdapter adapter = new DinosaurAdapter(this,R.layout.dino_list,dinosaurs);
        ListView lv = (ListView)findViewById(R.id.dino_lis_view);
        lv.setAdapter(adapter);

    }
}
