package flower.store;

import lombok.Getter;
import lombok.Setter;

/**
 * a pack of flowers, containing a specific type of flower and
 * quantity.
 */
@Getter
@Setter
public class FlowerPack {

    /**
     * The flower in the pack.
     */
    private Flower flower;

    /**
     * The quantity of the flower.
     */
    private int quantity;

    /**
     * Creates a new FlowerPack.
     *
     * @param flow the flower in the pack
     * @param quan the quantity of the flower
     */
    public FlowerPack(final Flower flow, final int quan) {
        this.flower = flow;
        this.quantity = quan;
    }

    /**
     * Calculates the total price of the flower pack based on the flower price
     * and quantity.
     *
     * @return the total price of the flower pack
     */
    public double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }
}
