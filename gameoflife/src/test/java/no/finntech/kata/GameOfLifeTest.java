package no.finntech.kata;

import java.awt.*;
import java.util.Arrays;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    public void testCreation() {
        GameOfLife gameOfLife = new GameOfLife(10, 20);
        assertThat(gameOfLife.getSize()).isEqualTo(200);
    }

    @Test
    public void testInitialization() {
        GameOfLife gameOfLife = new GameOfLife(10, 10);
        gameOfLife.bangBig(Arrays.asList(new Point(2, 2), new Point(8, 8)));
        assertThat(gameOfLife.getLiveCount()).isEqualTo(2);
    }

    @Test
    public void testAnylivecellwithfewerthantwoliveneighboursdiesasifcausedbyunderpopulation(){
        GameOfLife gameOfLife = new GameOfLife(10, 10);
        gameOfLife.bangBig(Arrays.asList(new Point(2, 2), new Point(8, 8)));
        gameOfLife.tick();
        assertThat(gameOfLife.getLiveCount()).isEqualTo(0);

    }

    @Test
    public void testAnylivecellwithmorethanthreeliveneighboursdiesasifbyovercrowding(){
        GameOfLife gameOfLife = new GameOfLife(10, 10);
        gameOfLife.bangBig(Arrays.asList(new Point(2, 2), new Point(8, 8), new Point(7, 8), new Point(9, 8), new Point(8, 7),
                new Point(8, 9)));
        gameOfLife.tick();
        assertThat(gameOfLife.getLiveCount()).isEqualTo(0);

    }
}
