package flower.store;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StoreTest {

    private static final double ROSE_SEPAL_LENGTH = 10.0;
    private static final double ROSE_PRICE = 5.0;
    private static final int ROSE_QUANTITY = 10;
    private static final double TULIP_SEPAL_LENGTH = 8.0;
    private static final double TULIP_PRICE = 7.0;
    private static final int TULIP_QUANTITY = 5;

    @Test
    public void testSearch() {
        Store store = new Store();

        Flower rose = new Rose(ROSE_SEPAL_LENGTH, FlowerColor.RED, ROSE_PRICE);
        Flower tulip = new Tulip(TULIP_SEPAL_LENGTH, FlowerColor.RED, TULIP_PRICE);

        FlowerPack rosePack = new FlowerPack(rose, ROSE_QUANTITY);
        FlowerPack tulipPack = new FlowerPack(tulip, TULIP_QUANTITY);

        FlowerBucket roseBucket = new FlowerBucket();
        roseBucket.add(rosePack);

        FlowerBucket tulipBucket = new FlowerBucket();
        tulipBucket.add(tulipPack);

        store.addBucket(roseBucket);
        store.addBucket(tulipBucket);

        List<FlowerBucket> result = store.search(FlowerType.ROSE);

        Assertions.assertEquals(1, result.size());
        Assertions.assertTrue(result.contains(roseBucket));
        Assertions.assertFalse(result.contains(tulipBucket));
    }
}
