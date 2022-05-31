package org.hunt.season;

public class Gosse extends Animal{
    private String name;

    public Gosse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String sayBeforeDeath() {
        return "Ga-Ga!";

    }
}
