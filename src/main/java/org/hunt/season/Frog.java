package org.hunt.season;

public class Frog extends Animal{
    private String name;

    public Frog(String name) {
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
        return "Kva-kva!";
    }
}
