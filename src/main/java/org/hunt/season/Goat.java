package org.hunt.season;

public class Goat extends Animal{
    private String name;

    public Goat(String name) {
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
        return "Beee!";

    }
}
