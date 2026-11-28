package com.comp2042;

import javafx.scene.image.Image;

public class RainbowCoin extends Coin {
    private final Image rainbowImage = new Image("resources/views/res/rainbowcoin.png");

    public RainbowCoin(int width, int height, Snake snake, Obstacle obstacle) {
        super(width, height, snake, obstacle);
    }


    @Override
    public double getSpeedBonus() {
        return 5.0;
    }

    @Override
    public Image getImage() {
        return rainbowImage;
    }
}
