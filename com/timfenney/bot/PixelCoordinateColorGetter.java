package com.timfenney.bot;
import java.awt.Robot;
import java.awt.Color;

public class PixelCoordinateColorGetter implements ColorGetter {
    private Robot r;
    private int x;
    private int y;
    public PixelCoordinateColorGetter(Robot r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return r.getPixelColor(x, y);
    }
}
