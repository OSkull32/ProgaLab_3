package org.itmo.lab3.object;

import org.itmo.lab3.story.*;

public class ChristopherRobin extends Creature implements Visitable {

    public ChristopherRobin(String name) {
        super(name);
    }

    public void wasAtFriend(Time when, Event onWhat, Creature creature) {
        System.out.println(when.getName() + " " + this.getName() + onWhat.getEventDescribe() + creature.getName() + ",");
    }

    public void grabBall(Actions action, Thing ball, Colours colour1, Colours colour2) {
        System.out.println("поэтому "+ this.getName() + " пришлось, так и быть, " + action.getActionDescribe() + " с собой оба " + ball.getName() + "-- и " + colour1.getColourBall() + ", и " + colour2.getColourBall() + ".");
    }
}
