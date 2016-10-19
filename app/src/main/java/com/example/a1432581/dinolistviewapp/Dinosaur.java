package com.example.a1432581.dinolistviewapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 1432581 on 10/19/2016.
 */
public class Dinosaur implements Parcelable {
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

    protected Dinosaur(Parcel in) {
        name = in.readString();
        drawable = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(drawable);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Dinosaur> CREATOR = new Parcelable.Creator<Dinosaur>() {
        @Override
        public Dinosaur createFromParcel(Parcel in) {
            return new Dinosaur(in);
        }

        @Override
        public Dinosaur[] newArray(int size) {
            return new Dinosaur[size];
        }
    };
}