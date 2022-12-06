package org.itmo.lab3.object;

import org.itmo.lab3.story.Colours;
import org.itmo.lab3.story.Size;

public class NativeAndFamiliar extends Creature implements Takeable {
    public NativeAndFamiliar(String name) {
        super(name);
    }

    public void prepareGift(Colours colour, Size size, Thing ball) {
        System.out.println("а одному из " + this.getName() + " приготовили " + size.getSizeObject() + " " + colour.getColourBall() + " " + ball.getName() + ",");
    }

    @Override
    public String notTake() {
        return this.getName() + " не взяли в гости";
    }

    public void notVisit(Size size) {
        System.out.println("Потому что сам он был еще " + size.getSizeObject() + ", что " + notTake());
    }
}
