package al.tonikolaba.entity;

import al.tonikolaba.tilemap.TileMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Enemy Projectile")
public class EnemyProjectileTest {

    private EnemyProjectile projectile;

    @BeforeEach
    void setUp() {
        projectile = new TestProjectile(new TileMap(30)); // Usa un TileMap para inicializar
    }

    @Test
    @DisplayName("Damage Getter")
    public void testGetDamage() {
        assertEquals(10, projectile.getDamage(), "Damage should be initialized to 10");
    }

    @Test
    @DisplayName("Remove Status")
    public void testShouldRemove() {
        assertFalse(projectile.shouldRemove(), "Projectile should not be removed initially");
    }

    @Test
    @DisplayName("Hit and Remove")
    public void testSetHitAndRemove() {
        projectile.setHit();
        assertTrue(projectile.shouldRemove(), "Projectile should be marked for removal after hit");
    }

    @Test
    @DisplayName("Update Method Execution")
    public void testUpdate() {
        assertDoesNotThrow(() -> projectile.update(), "Updating projectile should not throw an exception");
    }

    // Clase auxiliar para probar EnemyProjectile
    class TestProjectile extends EnemyProjectile {
        public TestProjectile(TileMap tm) {
            super(tm);
            damage = 10;
            remove = false;
        }

        @Override
        public void setHit() {
            remove = true;
        }

        @Override
        public void update() {
            // Implementación de prueba
        }
    }
}