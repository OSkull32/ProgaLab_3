package org.itmo.lab3.things;

import org.itmo.lab3.person.IAttachableName;

import java.util.Objects;

public abstract class Thing implements IAttachableName {
    private String name;

    protected Thing(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (!this.getClass().equals(otherObject.getClass())) return false;

        Thing other = (Thing) otherObject;

        return this.name.equals(other.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    @Override
    public String toString()
    {
        return this.getClass().getName() + "["
                + "name=" + name + "]";
    }
}