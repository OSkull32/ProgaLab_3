package org.itmo.lab3.person;

import org.itmo.lab3.places.IActionable;
import org.itmo.lab3.story.*;
import org.itmo.lab3.things.Ball;

import java.util.Objects;

public abstract class Person implements IActionBall, IActionable, IAttachableName {
    private String name;

    protected Person(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescribe() {
        return getName();
    }

    protected void setName(String name) {
        this.name = name;
    }

    public static void getPresent(IActionBall person, Colours colours, Size size, Ball ball)
    {
        person.getBall(colours,size, ball);
    }

    public void wasAtFriend(Time when, Event onWhat) {
        System.out.println(when.getName() + " " + this.getName() + onWhat.getEventDescribe() + ",");
    }

    @Override
    public void grabBall(Actions action, Ball ball, Colours colour1, Colours colour2)
    {
        System.out.println("поэтому "+ this.getName() + " пришлось, так и быть, " + action.getActionDescribe() + " с собой оба " + ball.getName() + "-- и " + colour1.getColourBall() + " и " + colour2.getColourBall());
    }

    public static void givePresent(IActionBall person) {
        person.gaveBall();
    }

    @Override
    public void getBall(Colours colour, Size size, Ball ball)
    {
        System.out.println(this.getName() + " достался " + size.getSizeObject() + " " + colour.getColourBall() + " " + ball.getName() + ",");
    }

    @Override
    public void gaveBall()
    {
        System.out.println("и там " + this.getName() + " дарили воздушные шарики.");
    };

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if (!otherObject.getClass().equals(this.getClass()))
            return false;
        Person other = (Person) otherObject;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + "name=" + this.name + "]";
    }

}
