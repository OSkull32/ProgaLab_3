package org.itmo.lab3.person;

import org.itmo.lab3.story.Actions;
import org.itmo.lab3.things.Thing;

public class WinniePooh extends Person{
    public WinniePooh(String name)
    {
        super(name);
    }

    public void tellSecret(Actions actions1, Thing thing1, Thing thing2, Actions actions2, Thing person) {
        System.out.println(actions1.getActionDescribe() + " " + thing1.getName() + " к " + thing2.getName() + " и " + actions2.getActionDescribe() + " страшным " + person.getName() + ":");
    }

    public void makeSure(Actions actions1, Actions actions2, Actions actions3, Person person) {
        System.out.println(this.getName() + " " + actions1.getActionDescribe() + ", и " + actions2.getActionDescribe() + person.getName() + " " + actions3.getActionDescribe() + ",");
    }
}
