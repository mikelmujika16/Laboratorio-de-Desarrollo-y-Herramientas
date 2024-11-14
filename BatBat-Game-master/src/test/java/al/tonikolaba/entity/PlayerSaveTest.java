package al.tonikolaba.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas para PlayerSave.
 * Autor: N.Kolaba
 */
@DisplayName("Player Save")
class PlayerSaveTest {

    @Test
    void playerSave() {
        PlayerSave ps = new PlayerSave();
        PlayerSave ps1 = new PlayerSave();
        PlayerSave ps2 = new PlayerSave();
        PlayerSave ps3 = new PlayerSave();
        PlayerSave ps4 = new PlayerSave();

        assertNotNull(ps);
        assertNotNull(ps1);
        assertNotNull(ps2);
        assertNotNull(ps3);
        assertNotNull(ps4);
    }

    @Test
    void init() {
        PlayerSave ps = new PlayerSave();
        PlayerSave ps1 = new PlayerSave();

        assertNotNull(ps);
        assertNotNull(ps1);

        PlayerSave.setLives(3);
        int expectedLives = 3;
        assertEquals(expectedLives, PlayerSave.getLives());

        PlayerSave.setHealth(5);
        int expectedHealth = 5;
        assertEquals(expectedHealth, PlayerSave.getHealth());

        PlayerSave.setTime(0);
        long expectedTime = 0;
        assertEquals(expectedTime, PlayerSave.getTime());
    }

    @Test
    void getLives() {
        PlayerSave ps = new PlayerSave();
        assertNotNull(ps);

        PlayerSave.setLives(3);
        int expectedLives = 3;
        assertEquals(expectedLives, PlayerSave.getLives());

        PlayerSave.setLives(2);
        int expectedLives2 = 2;
        assertEquals(expectedLives2, PlayerSave.getLives());

        PlayerSave.setLives(1);
        int expectedLives3 = 1;
        assertEquals(expectedLives3, PlayerSave.getLives());

        PlayerSave.setLives(0);
        int expectedLives4 = 0;
        assertEquals(expectedLives4, PlayerSave.getLives());
    }

    @Test
    void getHealth() {
        PlayerSave ps = new PlayerSave();
        assertNotNull(ps);

        PlayerSave.setHealth(5);
        int expectedHealth = 5;
        assertEquals(expectedHealth, PlayerSave.getHealth());

        PlayerSave.setHealth(10);
        int expectedHealth2 = 10;
        assertEquals(expectedHealth2, PlayerSave.getHealth());

        PlayerSave.setHealth(15);
        int expectedHealth3 = 15;
        assertEquals(expectedHealth3, PlayerSave.getHealth());

        PlayerSave.setHealth(0);
        int expectedHealth4 = 0;
        assertEquals(expectedHealth4, PlayerSave.getHealth());

        PlayerSave.setHealth(3);
        int expectedHealth5 = 3;
        assertEquals(expectedHealth5, PlayerSave.getHealth());
    }

    @Test
    void getTime() {
        PlayerSave ps = new PlayerSave();
        assertNotNull(ps);

        PlayerSave.setTime(0);
        long expectedTime = 0;
        assertEquals(expectedTime, PlayerSave.getTime());

        PlayerSave.setTime(1);
        long expectedTime2 = 1;
        assertEquals(expectedTime2, PlayerSave.getTime());
    }
}
