package org.itmo.lab3.story;

public enum Colours {
    GREEN("Зеленый"),
    BLUE("синий");

    private final String colourBall;
    Colours(String colourBall) {
        this.colourBall = colourBall;
    }

    public String getColourBall() {
        return colourBall;
    }
}