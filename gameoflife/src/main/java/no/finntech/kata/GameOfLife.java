package no.finntech.kata;

import java.awt.*;

/**
 * Hello world!
 */
public class GameOfLife {
    private boolean[][] gameBoard;

    public GameOfLife(int height, int width) {
        gameBoard = new boolean[height][width];
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int getSize() {
        return gameBoard.length * gameBoard[0].length;
    }

    public void bangBig(java.util.List<Point> points) {
        for (Point point : points) {
            gameBoard[point.y][point.x] = true;
        }
    }

    public int getLiveCount() {
        int count = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            boolean[] row = gameBoard[i];
            for (int j = 0; j < row.length; j++) {
                if(row[j]){
                   count++;
                }
            }
        }
        return count;
    }

    public void tick() {

    }
}
