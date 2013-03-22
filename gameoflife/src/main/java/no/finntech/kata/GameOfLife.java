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
        for (int i = 0; i < gameBoard.length; i++) {
            boolean[] row = gameBoard[i];
            for (int j = 0; j < row.length; j++) {
                if(row[j]){
                    if(shouldCellDie(i, j)) {
                        row[j] = false;
                    }
                }
            }
        }
    }

    private boolean shouldCellDie(int i, int j) {
        int liveCount = 0;
        if(isNeighbourAlive(i - 1, j - 1)) {
            liveCount++;
        }
        if(isNeighbourAlive(i - 1, j)) {
            liveCount++;
        }
        if(isNeighbourAlive(i - 1, j + 1)) {
            liveCount++;
        }
        if(isNeighbourAlive(i, j - 1)) {
            liveCount++;
        }
        if(isNeighbourAlive(i, j + 1)) {
            liveCount++;
        }
        if(isNeighbourAlive(i + 1, j - 1)) {
            liveCount++;
        }
        if(isNeighbourAlive(i + 1, j)) {
            liveCount++;
        }
        if(isNeighbourAlive(i + 1, j + 1)) {
            liveCount++;
        }
        return liveCount < 2 || liveCount > 3;
    }

    private boolean isNeighbourAlive(int i, int j) {
        return i >= 0 && i < getHeight() && j >= 0 && j < getWidth() && gameBoard[i][j];
    }

    private int getWidth() {
        return gameBoard[0].length;
    }

    private int getHeight() {
        return gameBoard.length;
    }


    public void print(){
        System.out.println();
        for (boolean[] row : gameBoard) {
            for (boolean b : row) {
                if(b){
                    System.out.print("x ");

                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }


}
