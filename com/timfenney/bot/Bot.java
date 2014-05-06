package com.timfenney.bot;
import java.awt.Robot;
import java.awt.Color;

public class Bot {
    private Robot r;
    private Sleeper s;
    private Command c;
    private ColorDetector cd;
    private ColorGetter cg;

    public Bot(Robot r, Sleeper s, Command c, ColorDetector cd, ColorGetter cg) {
        this.r = r;
        this.s = s;
        this.c = c;
        this.cd = cd;
        this.cg = cg;
    }

    public void run() {
        while (true) {
            s.sleep();
            Color color = cg.getColor();
            if (cd.detect(color)) {
                c.performCommand();
            }
        }
    }
}
