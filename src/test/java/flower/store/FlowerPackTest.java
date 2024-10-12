package flower.store;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlowerPackTest {

    @Test
    public void testCreateFlowerPack() {
        Flower rose = new Rose(12.0, FlowerColor.RED, 5.0);
        FlowerPack pack = new FlowerPack(rose, 10);
        assertEquals(rose, pack.getFlower());
        assertEquals(10, pack.getQuantity());
    }

    @Test
    public void testGetPrice() {
        Flower tulip = new Tulip(8.0, FlowerColor.BLUE, 7.0);
        FlowerPack pack = new FlowerPack(tulip, 5);
        double expectedPrice = 7.0 * 5;
        assertEquals(expectedPrice, pack.getPrice(), 0.01);
    }

    @Test
    public void testSetQuantity() {
        Flower chamomile = new Flower(10.0, FlowerColor.RED, 3.0, FlowerType.CHAMOMILE);
        FlowerPack pack = new FlowerPack(chamomile, 10);
        pack.setQuantity(15);
        assertEquals(15, pack.getQuantity());
    }

    @Test
    public void testSetFlower() {
        Flower tulip = new Tulip(6.0, FlowerColor.RED, 4.0);
        Flower rose = new Rose(10.0, FlowerColor.RED, 5.0);
        FlowerPack pack = new FlowerPack(tulip, 5);
        pack.setFlower(rose);
        assertEquals(rose, pack.getFlower());
    }
}
