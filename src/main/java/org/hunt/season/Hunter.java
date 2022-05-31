package org.hunt.season;

public class Hunter {
    private Animal currentAnimal;

    public Hunter(Animal currentAnimal) {
        this.currentAnimal = currentAnimal;
    }

    public void killAnimal(){
        System.out.println("Shooting "+ currentAnimal.getName() + "\nHit!!!\n" + currentAnimal.sayBeforeDeath());
    }
}
