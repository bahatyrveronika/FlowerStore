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
    private static final double CHAMOMILE_SEPAL_LENGTH = 10.0;
    private static final double CHAMOMILE_PRICE = 3.0;
    private static final double TULIP_SEPAL_LENGTH_2 = 6.0;
    private static final double TULIP_PRICE_2 = 4.0;
    private static final double ROSE_SEPAL_LENGTH_2 = 10.0;
    private static final double ROSE_PRICE_2 = 5.0;
    private static final int PACK_QUANTITY = 5;

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
        FlowerPack pack = new FlowerPack(tulip, PACK_QUANTITY);
        double expectedPrice = TULIP_PRICE * PACK_QUANTITY;
        Assertions.assertEquals(expectedPrice, pack.getPrice(), DELTA);
    }

    @Test
    public void testSetQuantity() {
        Flower chamomile = new Flower(CHAMOMILE_SEPAL_LENGTH, FlowerColor.RED,
                CHAMOMILE_PRICE, FlowerType.CHAMOMILE);
        FlowerPack pack = new FlowerPack(chamomile, INITIAL_QUANTITY);
        pack.setQuantity(NEW_QUANTITY);
        Assertions.assertEquals(NEW_QUANTITY, pack.getQuantity());
    }

    @Test
    public void testSetFlower() {
        Flower tulip = new Tulip(TULIP_SEPAL_LENGTH_2, FlowerColor.RED,
                TULIP_PRICE_2);
        Flower rose = new Rose(ROSE_SEPAL_LENGTH_2, FlowerColor.RED,
                ROSE_PRICE_2);
        FlowerPack pack = new FlowerPack(tulip, PACK_QUANTITY);
        pack.setFlower(rose);
        Assertions.assertEquals(rose, pack.getFlower());
    }
}
