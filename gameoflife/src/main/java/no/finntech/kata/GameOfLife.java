package no.finntech.kata;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class GameOfLife
{
    private boolean[][] gameBoard;

    public GameOfLife(int height, int width) {
        gameBoard = new boolean[height][width];
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int getSize() {
        return gameBoard.length * gameBoard[0].length;
    }

    public List bangBig(java.util.List<Point> points) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public int getLiveCount() {
        return 0;  //To change body of created methods use File | Settings | File Templates.
    }
}
