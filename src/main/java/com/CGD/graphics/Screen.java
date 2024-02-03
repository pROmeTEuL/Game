package com.CGD.graphics;

import java.util.Random;

import com.CGD.Game;

public class Screen extends Render {
    private Render test;
    private Render3D render;
    public Screen(int width, int height) {
        super(width, height);
        test = new Render(256, 256);
        render = new Render3D(width, height);
        Random random = new Random();
        for (int i = 0; i < 256 * 256; i++) {
            test.pixels[i] = random.nextInt();
        }
    }
    public void render(Game game) {
        for (int i = 0; i < width * height; i++) {
            pixels[i] = 0;
        }
        for (int i = 0; i < 50; i++) {
            int anim = (int) (Math.sin(game.time + i) / 1000);
            int anim2 = (int) (Math.cos(game.time + i) * 1000);
        }
        render.floor(game);
        draw(render, 0, 0);
    }
}
