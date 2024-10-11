package flower.store;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Tulip extends Flower {
    /**
     * Creates a new Tulip with sepal length, color, and price.
     *
     * @param sepalLength the length of the sepal
     * @param color the color
     * @param price the price
     */
    public Tulip(final double sepalLength,
    final FlowerColor color, final double price) {
        super(sepalLength, color, price, FlowerType.TULIP);
    }
}
