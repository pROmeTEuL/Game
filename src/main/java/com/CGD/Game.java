package com.CGD;

import java.awt.event.KeyEvent;
import com.CGD.input.Controller;

public class Game {
    public int time;
    public Controller controls = new Controller();
    public Game() {
        time = 0;
    }
    public void tick(boolean[] keys) {
        time++;
        boolean forward = keys[KeyEvent.VK_W];
        boolean back = keys[KeyEvent.VK_S];
        boolean left = keys[KeyEvent.VK_A];
        boolean right = keys[KeyEvent.VK_D];
        boolean turnLeft = keys[KeyEvent.VK_LEFT];
        boolean turnRight = keys[KeyEvent.VK_RIGHT];
        controls.tick(forward, back, left, right, turnLeft, turnRight);
    }
}
