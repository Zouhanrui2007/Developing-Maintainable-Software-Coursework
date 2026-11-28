package com.comp2042;

import javafx.scene.image.Image;
import java.util.Random;

public class SilverCoin extends Coin {
    private final Image siliverImage = new Image("resources/views/res/silvercoin.png");

    public SilverCoin(int width, int height, Snake snake, Obstacle obstacle) {
        super(width, height, snake, obstacle);
    }

    @Override
    public void onCollected(Snake snake, Game game, Obstacle obstacle) {
        Random random = new Random();
        int boardArea = game.getWidth() * game.getHeight();
        int amount = random.nextInt(boardArea / 20) + 3;

        obstacle.newObstacles(snake, this, amount);
        game.decMaxScore(obstacle.getObstacles().size());
    }

    @Override
    public Image getImage() {
        return siliverImage;
    }
}
