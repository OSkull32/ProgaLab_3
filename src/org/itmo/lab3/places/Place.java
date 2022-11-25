package org.itmo.lab3.places;

import org.itmo.lab3.person.IAttachableName;

import java.util.Objects;

public abstract class Place implements IActionable, IAttachableName {
    private String name;

    protected Place(String name){
        this.setName(name);
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescribe() {
        return getName();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if (!this.getClass().equals(otherObject.getClass()))
            return false;
        Place other = (Place) otherObject;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" + "name=" + this.name + "]";
    }
}
