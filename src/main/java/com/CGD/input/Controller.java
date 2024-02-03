package com.CGD.input;

public class Controller {
    public double x, z, rotation, xa, za, rotationa;
    public void tick(boolean forward, boolean back, boolean left, boolean right, boolean turnLeft, boolean turnRight) {
        double rotationSpeed = 0.01;
        double walkSpeed = 0.5;
        double xMove = 0;
        double zMove = 0;
        if (forward) {
            zMove++;
        }
        if (back) {
            zMove--;
        }
        if (left) {
            xMove--;
        }
        if (right) {
            xMove++;
        }
        if (turnLeft) {
            rotationa -= rotationSpeed;
        }
        if (turnRight) {
            rotationa += rotationSpeed;
        }
        xa += (xMove * Math.cos(rotation) + zMove * Math.sin(rotation)) * walkSpeed;
        za += (zMove * Math.cos(rotation) - xMove * Math.sin(rotation)) * walkSpeed;
        x += xa;
        z += za;
        rotation += rotationa;
        xa *= 0.1;
        za *= 0.1;
        rotationa *= 0.8;
    }
}
