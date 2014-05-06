package com.timfenney.bot;
import java.awt.Robot;

public class Main {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Sleeper cycleSleeper = new Sleeper(10);
            Sleeper shootSleeper = new Sleeper(5);
            Command command = new ShootCommand(robot, shootSleeper);
            ColorDetector colorDetector = new GreenDetector(robot);
            ColorGetter colorGetter = new PixelCoordinateColorGetter(robot,
                Screen.width/2, Screen.height/2);
	    Bot bot = new Bot(robot, cycleSleeper, command, colorDetector,
                colorGetter);
	    bot.run();
        }
        catch (Exception e) {
        }
    }
}
