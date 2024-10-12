package flower.store;

import java.util.ArrayList;

import java.util.List;

public class Store {

    final private List<FlowerBucket> buketiki = new ArrayList<>();

    /**
     * Adds a flower bucket to buketiki
     *
     * @param bucket the flower bucket to add.
     */
    public void addBucket(FlowerBucket bucket) {
        this.buketiki.add(bucket);
    }

    /**
     * Searches for flower buckets in buketiki.
     *
     * @param type flower for searching.
     * @return a list of flower buckets
     */
    public List<FlowerBucket> search(FlowerType type) {
        List<FlowerBucket> rez = new ArrayList<>();
        for (FlowerBucket bucket : this.buketiki) {
            for (FlowerPack pack : bucket.getFlowerPacks()) {
                if (pack.getFlower().getFlowerType() == type) {
                    rez.add(bucket);
                    break;
                }
            }
        }
        return rez;
    }
}
