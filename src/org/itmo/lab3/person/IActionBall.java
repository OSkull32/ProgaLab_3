package org.itmo.lab3.person;

import org.itmo.lab3.story.Actions;
import org.itmo.lab3.story.Colours;
import org.itmo.lab3.story.Size;
import org.itmo.lab3.things.Ball;

interface IActionBall {
    void getBall(Colours colours, Size size, Ball ball);
    void gaveBall();
    void grabBall(Actions action, Ball ball, Colours colour1, Colours colour2);
}
