package org.itmo.lab3.story;

public enum Actions {
    MAKE_SURE("убедившись, что "),
    TO_BE("был"),
    LOOK_AROUND("оглянулся"),
    NOT_EAVESDROPPING("не подслушивает"),
    PRESS("Прижал"),
    SEIZE("захватить"),
    SAYING("сказал");

    private final String actionDescribe;
    Actions(String actionDescribe) {
        this.actionDescribe = actionDescribe;
    }

    public String getActionDescribe() {
        return actionDescribe;
    }
}