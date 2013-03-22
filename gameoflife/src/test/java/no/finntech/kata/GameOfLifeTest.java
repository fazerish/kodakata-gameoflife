package no.finntech.kata;

import org.junit.Test;
import static org.fest.assertions.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    void testInitialization(){
        GameOfLife gameOfLife = new GameOfLife(10, 20);
        assertThat(gameOfLife).isEqualTo(new Integer(200));
    }
}
