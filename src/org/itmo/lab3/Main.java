package org.itmo.lab3;

import org.itmo.lab3.person.*;
import org.itmo.lab3.places.*;
import org.itmo.lab3.story.*;
import org.itmo.lab3.things.*;

import static org.itmo.lab3.person.Person.*;

public class Main {
    public static void main(String[] args) {
        //Винни-Пух оглянулся и, убедившись, что никто не подслушивает, прижал лапу к губам и сказал страшным шепотом:
        WinniePooh winniePooh = new WinniePooh("Винни-Пух");
        Nothing nothing = new Nothing("никто");
        Lips lips = new Lips("губам");
        Paw paw = new Paw("лапу");
        Whisper whisper = new Whisper("шепотом");
        winniePooh.makeSure(Actions.LOOK_AROUND, Actions.MAKE_SURE, Actions.NOT_EAVESDROPPING, nothing);
        winniePooh.tellSecret(Actions.PRESS, paw, lips, Actions.SAYING, whisper);
        //Ну, а как раз накануне Кристофер Робин был на вечере у своего друга Пятачка
        Place eveningFriend = new EveningFriend("вечере у своего друга");
        IActionable pyatachock = new Pyatachok("Пятачка");
        Event beAtFriend = new Event(Actions.TO_BE, pyatachock, eveningFriend);
        ChristopherRobin christopherRobin = new ChristopherRobin("Кристофер Робин");
        christopherRobin.wasAtFriend(Time.JUST_THE_DAY_BEFORE, beAtFriend);
        //И там всем гостям дарили воздушные шарики.
        AllGuests allGuest = new AllGuests("всем гостям");
        givePresent(allGuest);
        //Кристоферу Робину достался большущий зеленый шар
        Ball ball = new Ball("шар");
        getPresent(christopherRobin, Colours.GREEN, Size.HUGE, ball);
        //А одному из Родных и Знакомых Кролика приготовили большой-пребольшой синий шар
        NativeAndFamiliar nativeAndFamiliar = new NativeAndFamiliar("Родных и Знакомых Кролика");
        getPresent(nativeAndFamiliar,Colours.BLUE, Size.VERY_BIG, ball);
        //Но этот Родственник и Знакомый его не взял
        nativeAndFamiliar.notTake();
        //Потому что сам он был еще такой маленький, что его не взяли в гости
        nativeAndFamiliar.notVisit(Size.SO_SMALL);
        //Поэтому Кристоферу Робину пришлось, так и быть, захватить с собой оба шара-- и зеленый и синий.
        christopherRobin.grabBall(Actions.SEIZE, ball, Colours.GREEN, Colours.BLUE);
    }
}