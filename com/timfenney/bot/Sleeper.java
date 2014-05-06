package com.timfenney.bot;

public class Sleeper {
    private int millis;
    public Sleeper(int millis) {
        this.millis = millis;
    }

    public void sleep() {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
        }
    }
}
