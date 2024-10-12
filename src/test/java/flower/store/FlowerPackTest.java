package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerPackTest {

    private static final double ROSE_SEPAL_LENGTH = 12.0;
    private static final double ROSE_PRICE = 5.0;
    private static final int INITIAL_QUANTITY = 10;
    private static final double TULIP_SEPAL_LENGTH = 8.0;
    private static final double TULIP_PRICE = 7.0;
    private static final int NEW_QUANTITY = 15;
    private static final double DELTA = 0.01;

    @Test
    public void testCreateFlowerPack() {
        Flower rose = new Rose(ROSE_SEPAL_LENGTH, FlowerColor.RED, ROSE_PRICE);
        FlowerPack pack = new FlowerPack(rose, INITIAL_QUANTITY);
        Assertions.assertEquals(rose, pack.getFlower());
        Assertions.assertEquals(INITIAL_QUANTITY, pack.getQuantity());
    }

    @Test
    public void testGetPrice() {
        Flower tulip = new Tulip(TULIP_SEPAL_LENGTH, FlowerColor.BLUE, TULIP_PRICE);
        FlowerPack pack = new FlowerPack(tulip, 5);
        double expectedPrice = TULIP_PRICE * 5;
        Assertions.assertEquals(expectedPrice, pack.getPrice(), DELTA);
    }

    @Test
    public void testSetQuantity() {
        Flower chamomile = new Flower(10.0, FlowerColor.RED, 3.0, FlowerType.CHAMOMILE);
        FlowerPack pack = new FlowerPack(chamomile, INITIAL_QUANTITY);
        pack.setQuantity(NEW_QUANTITY);
        Assertions.assertEquals(NEW_QUANTITY, pack.getQuantity());
    }

    @Test
    public void testSetFlower() {
        Flower tulip = new Tulip(6.0, FlowerColor.RED, 4.0);
        Flower rose = new Rose(10.0, FlowerColor.RED, 5.0);
        FlowerPack pack = new FlowerPack(tulip, 5);
        pack.setFlower(rose);
        Assertions.assertEquals(rose, pack.getFlower());
    }
}
