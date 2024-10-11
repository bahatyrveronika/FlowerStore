package flower.store;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Rose flower.
 */
@Getter
@Setter
public class Rose extends Flower {

    /**
     * default price of a Rose.
     */
    private static final int VAL = 10;

    /**
     * creates a Rose with attributes.
     *
     * @param sepalLength the length of the sepal
     * @param color the color of the rose
     * @param price the price of the rose
     */
    public Rose(final double sepalLength,
        final FlowerColor color, final double price) {
        super(sepalLength, color, price, FlowerType.ROSE);
    }

    /**
     * makes a default Rose with attributes.
     */
    public Rose() {
        super(0.0, FlowerColor.RED, VAL, FlowerType.ROSE);
    }
}
