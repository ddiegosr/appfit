package com.uespi.appfit.classes;

import android.graphics.drawable.Drawable;

import com.uespi.appfit.R;

public class Instructor {
    private String name;
    private String description;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
