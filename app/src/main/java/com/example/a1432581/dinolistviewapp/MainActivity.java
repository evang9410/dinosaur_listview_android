package com.example.a1432581.dinolistviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Dinosaur dinosaurs[] = new Dinosaur[]{
                new Dinosaur("Cryolophosaurus", R.drawable.cryolophosaurus),
                new Dinosaur("Giganotosaurus", R.drawable.giganotosaurus),
                new Dinosaur("Paralititan", R.drawable.paralititan),
                new Dinosaur("Parasaurolophus", R.drawable.parasaurolophus),
                new Dinosaur("Supersaurus", R.drawable.supersaurus)

        };
        DinosaurAdapter adapter = new DinosaurAdapter(this, R.layout.dino_list, dinosaurs);
        ListView lv = (ListView) findViewById(R.id.dino_lis_view);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this,DinoInfo.class);
                i.putExtra("Dino",dinosaurs[position]);
                startActivity(i);

            }
        });


    }
}
