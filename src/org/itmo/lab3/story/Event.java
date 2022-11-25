package org.itmo.lab3.story;


import org.itmo.lab3.places.IActionable;
import org.itmo.lab3.places.Place;

import java.util.Objects;

public class Event {
    private String event;

    public Event(Actions action, IActionable what, Place where)
    {
        event = action.getActionDescribe() + " на " + where.getName() + " " + what.getDescribe();
    }
    public String getEventDescribe() {
        return event;
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (!this.getClass().equals(otherObject.getClass())) return false;

        Event other = (Event) otherObject;

        return Objects.equals(this.event, other.event);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(event);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "event=" + event + "]";
    }
}