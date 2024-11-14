package al.tonikolaba.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import al.tonikolaba.tilemap.TileMap;

/**
 * Pruebas para la clase Player.
 * Autor: N.Kolaba
 */
@DisplayName("Player")
class PlayerTest {

    @Test
    void testSetAttacking() {
        TileMap tm = new TileMap(30);
        Player play = new Player(tm);
        assertNotNull(play);

        // Caso 1:
        play.attacking = false;
        play.upattacking = false;
        play.setAttacking();
        assertTrue(play.attacking);

        // Caso 2:
        Player play1 = new Player(tm);
        play1.stop();
        play.setAttacking();
        assertEquals(false, play1.attacking);

        // Caso 3:
        Player play2 = new Player(tm);
        play2.setAttacking();
        play2.hit(4);
        assertEquals(false, play2.attacking);

        // Caso 4:
        Player play3 = new Player(tm);
        play3.getNextPosition();
        play3.setAttacking();
        assertEquals(true, play3.attacking);

        // Caso 5:
        Player play4 = new Player(tm);
        play4.hit(5);
        play4.getNextPosition();
        play4.setAttacking();
        assertEquals(true, play4.attacking);
    }

    @Test
    void testGetTimeToString() {
        TileMap tm = new TileMap(30);
        Player play6 = new Player(tm);
        assertNotNull(play6);

        // Caso 1:
        play6.setTime(7200);
        assertEquals("2:00", play6.getTimeToString());

        // Caso 2:
        play6.setTime(0);
        assertEquals("0:00", play6.getTimeToString());

        // Caso 3:
        play6.setTime(-7200);
        assertEquals("-2:00", play6.getTimeToString());

        // Caso 4:
        play6.setTime(3600 / 10);
        assertEquals("0:06", play6.getTimeToString());
    }
}
