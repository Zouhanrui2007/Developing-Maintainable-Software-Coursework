package com.comp2042;

import javafx.scene.image.Image;

public class GoldCoin extends Coin {    //gold coin is a type of coin
    private static final int POINT_VALUE = 15;  //set static value of 15 point
    private final Image goldImage = new Image("resources/views/res/goldcoin.png");

    public GoldCoin(int width, int height, Snake snake, Obstacle obstacle) {
        super(width, height, snake, obstacle);
    }

    @Override
    public Image getImage() {
        return goldImage;
    }

    @Override
    public int getPoints() {    //define point value = 15
        return POINT_VALUE;
    }
}
