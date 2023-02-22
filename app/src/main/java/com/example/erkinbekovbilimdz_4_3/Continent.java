package com.example.erkinbekovbilimdz_4_3;

public class Continent {
    private String name;
    private String background;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Continent(String name, String background) {
        this.name = name;
        this.background = background;
    }
}
