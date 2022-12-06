package org.itmo.lab3.object;

public class Guest extends Creature {
    public Guest(String name)
    {
        super(name);
    }

    public static void givePresent(Guest guest) {
        System.out.println("и там " + guest.getName() + " дарили воздушные шарики.");
    }
}
