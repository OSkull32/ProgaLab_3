package org.itmo.lab3.person;

import org.itmo.lab3.story.Colours;
import org.itmo.lab3.story.Size;
import org.itmo.lab3.things.Ball;

public class NativeAndFamiliar extends Person{
    public NativeAndFamiliar(String name) {
        super(name);
    }

    @Override
    public void getBall(Colours colour, Size size, Ball ball)
    {
        System.out.println("а одному из " + this.getName() + " приготовили " + size.getSizeObject() + " " + colour.getColourBall() + " " + ball.getName() + ",");
    }

    public void notTake()
    {
        System.out.println("но этот " + this.getName() + " его не взял,");
    }

    public void notVisit(Size size)
    {
        System.out.println("Потому что сам он был еще " + size.getSizeObject() + ", что его не взяли в гости");
    }
}
