package com.comp2042;

import javafx.scene.image.Image;

import java.awt.Point;
import java.util.Random;

public class Coin {
    private static final int DEFAULT_POINTS = 5;
    private final Point pos;
    private final Image image = new Image("resources/views/res/redcoin.png");

    public Coin(int width, int height, Snake snake, Obstacle obstacle) {
        Random random = new Random();
        Point position;

        do {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            position = new Point(x, y);
        } while (position.equals(snake.getHead())
                || snake.getBody().contains(position)
                || obstacle.getObstacles().contains(position));

        this.pos = position;
    }

    public Point getPos() {
        return new Point(pos);
    }

    public int getPoints() {
        return DEFAULT_POINTS;
    }

    public double getSpeedBonus() {
        return 0.0;
    }

    public void onCollected(Snake snake, Game game, Obstacle obstacle) {
    }

    public Image getImage() {
        return image;
    }
}
