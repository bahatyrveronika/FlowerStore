package flower.store;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StoreTest {

    @Test
    public void testSearch() {
        Store store = new Store();
        Flower rose = new Rose(10, FlowerColor.RED, 5);
        Flower tulip = new Tulip(8, FlowerColor.RED, 7);
        FlowerPack rosePack = new FlowerPack(rose, 10);
        FlowerPack tulipPack = new FlowerPack(tulip, 5);
        FlowerBucket bucket1 = new FlowerBucket();
        bucket1.add(rosePack);
        FlowerBucket bucket2 = new FlowerBucket();
        bucket2.add(tulipPack);
        store.addBucket(bucket1);
        store.addBucket(bucket2);
        List<FlowerBucket> result = store.search(FlowerType.ROSE);
        assertEquals(1, result.size());
        assertTrue(result.contains(bucket1));
        assertFalse(result.contains(bucket2));
    }
}
