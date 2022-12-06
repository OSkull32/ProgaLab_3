package org.itmo.lab3.object;

import org.itmo.lab3.story.Actions;

public class WinniePooh extends Creature {
    public WinniePooh(String name)
    {
        super(name);
    }

    public String pressPaw(Thing thing) {
        return "прижал " + thing.getName();
    }

    public void tellSecret(Thing thing, Thing thing2, Actions actions2, Thing thing3) {
        System.out.println(pressPaw(thing) + " к " + thing2.getName() + " и " + actions2.getActionDescribe() + " страшным " + thing3.getName() + ":");
    }

    public String eavesdrop(Creature creature) {
        if (creature == null) return " подслушивает разговор";
        if (creature instanceof NotEavesdropable) return creature.getName() + " не подслушивает";
        return creature.getName() + " подслушивает разговор";
    }
    public void makeSure(Actions actions1, Actions actions2, Creature creature) {
        System.out.println(this.getName() + " " + actions1.getActionDescribe() + ", и " + actions2.getActionDescribe() + eavesdrop(creature) + ",");
    }
}
