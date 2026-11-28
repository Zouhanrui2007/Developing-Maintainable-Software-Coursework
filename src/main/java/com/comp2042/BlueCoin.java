//collect the ability into the coin file
package com.comp2042;

import javafx.scene.image.Image;

public class BlueCoin extends Coin {    //define blue coin as a kind of coin
    private final Image blueImage = new Image("resources/views/res/bluecoin.png");

    public BlueCoin(int width, int height, Snake snake, Obstacle obstacle) {
        super(width, height, snake, obstacle);
    }


    @Override
    public void onCollected(Snake snake, Game game, Obstacle obstacle) {  //define what to do after eaten
        snake.ignoreBorders(true);
    }

    @Override
    public Image getImage() {
        return blueImage;
    }
}
