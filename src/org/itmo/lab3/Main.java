package org.itmo.lab3;

import org.itmo.lab3.object.*;
import org.itmo.lab3.story.*;

public class Main {
    public static void main(String[] args) {
        //Винни-Пух оглянулся и, убедившись, что никто не подслушивает, прижал лапу к губам и сказал страшным шепотом:
        WinniePooh winniePooh = new WinniePooh("Винни-Пух");
        Nothing nothing = new Nothing("никто");
        Thing lips = new Thing("губам");
        Thing paw = new Thing("лапу");
        Thing whisper = new Thing("шепотом");
        winniePooh.makeSure(Actions.LOOK_AROUND, Actions.MAKE_SURE, nothing);
        winniePooh.tellSecret(paw, lips, Actions.SAYING, whisper);

        //Ну, а как раз накануне Кристофер Робин был на вечере у своего друга Пятачка
        Place eveningFriend = new Place("вечере у своего друга");
        Guest pyatachock = new Guest("Пятачка");
        Event beAtFriend = new Event(Actions.TO_BE, eveningFriend);
        ChristopherRobin christopherRobin = new ChristopherRobin("Кристофер Робин");
        christopherRobin.wasAtFriend(Time.JUST_THE_DAY_BEFORE, beAtFriend, pyatachock);

        //И там всем гостям дарили воздушные шарики.
        Guest allGuest = new Guest("всем гостям");
        Guest.givePresent(allGuest);

        //Кристоферу Робину достался большущий зеленый шар
        Ball ball = new Ball("шар");
        Creature.getBall(Colours.GREEN, Size.HUGE, ball,christopherRobin);

        //А одному из Родных и Знакомых Кролика приготовили большой-пребольшой синий шар
        NativeAndFamiliar nativeAndFamiliars = new NativeAndFamiliar("Родных и Знакомых Кролика");
        nativeAndFamiliars.prepareGift(Colours.BLUE, Size.VERY_BIG, ball);

        //Но этот Родственник и Знакомый его не взял
        NativeAndFamiliar nativeAndFamiliar = new NativeAndFamiliar("Родственник и Знакомый");
        Creature.getBall(Colours.BLUE, Size.VERY_BIG, ball,nativeAndFamiliars);

        //Потому что сам он был еще такой маленький, что его не взяли в гости
        nativeAndFamiliar.notVisit(Size.SO_SMALL);

        //Поэтому Кристоферу Робину пришлось, так и быть, захватить с собой оба шара-- и зеленый и синий.
        christopherRobin.grabBall(Actions.SEIZE, ball, Colours.GREEN, Colours.BLUE);
    }
}