package org.hunt.season;

public abstract class Animal {
    public String name;
    public abstract String sayBeforeDeath();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
