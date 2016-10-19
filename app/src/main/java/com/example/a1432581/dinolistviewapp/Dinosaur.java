package com.example.a1432581.dinolistviewapp;

/**
 * Created by 1432581 on 10/19/2016.
 */
public class Dinosaur {
    private String name;
    private int drawable;
    public Dinosaur(String name, int drawable){
        this.name = name;
        this.drawable = drawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
