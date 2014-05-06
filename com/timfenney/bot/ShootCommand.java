package com.timfenney.bot;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class ShootCommand implements Command {
    private Robot r;
    private Sleeper s;
    public ShootCommand(Robot r, Sleeper s) {
        this.r = r;
        this.s = s;
    }
    public void performCommand() {
        r.mousePress(InputEvent.BUTTON1_MASK);
        s.sleep();
        r.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}
