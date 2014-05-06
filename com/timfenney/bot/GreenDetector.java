package com.timfenney.bot;
import java.awt.Robot;
import java.awt.Color;

public class GreenDetector implements ColorDetector {
    private Robot r;
    public GreenDetector(Robot r) {
         this.r = r;
    }
    public boolean detect(Color color) {
        int green = color.getGreen();
        if (green > color.getRed() && green > color.getBlue()) {
            return true;
        } else {
            return false;
        }
    }
}
