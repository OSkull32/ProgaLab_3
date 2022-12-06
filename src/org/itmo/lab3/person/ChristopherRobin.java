package org.itmo.lab3.person;

import org.itmo.lab3.story.Actions;
import org.itmo.lab3.story.Colours;
import org.itmo.lab3.story.Size;
import org.itmo.lab3.things.Ball;

public class ChristopherRobin extends Person{

    public ChristopherRobin(String name) {
        super(name);
    }

    @Override
    public void getBall(Colours colour, Size size, Ball ball)
    {
        System.out.println(this.getName() + " достался " + size.getSizeObject() + " " + colour.getColourBall() + " " + ball.getName() + ",");
    }

    @Override
    public void grabBall(Actions action, Ball ball, Colours colour1, Colours colour2)
    {
        System.out.println("поэтому "+ this.getName() + " пришлось, так и быть, " + action.getActionDescribe() + " с собой оба " + ball.getName() + "-- и " + colour1.getColourBall() + ", и " + colour2.getColourBall() + ".");
    }
}
