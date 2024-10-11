package flower.store;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Flower {

    /**
     * The length of the sepal of the flower.
     */
    @Getter
    private double sepalLength;

    /**
     * The color of the flower.
     */
    private FlowerColor color;

    /**
     * The price of the flower.
     */
    @Getter
    private double price;

    /**
     * The type of the flower.
     */
    @Getter
    private FlowerType flowerType;

    /**
     * Constructs a Flower with specified attributes.
     *
     * @param sepalL the length of the sepal
     * @param col the color of the flower
     * @param pr the price of the flower
     * @param flowerT the type of the flower
     */
    public Flower(final double sepalL, final FlowerColor col,
            final double pr, final FlowerType flowerT) {
        this.sepalLength = sepalL;
        this.color = col;
        this.price = pr;
        this.flowerType = flowerT;
    }

    /**
     * Returns the price of the flower.
     *
     * @return the price of the flower.
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets the price of flower.
     *
     * @param p the new price of flower.
     */
    public void setPrice(final double p) {
        this.price = p;
    }

    /**
     * Returns the color of the flower.
     *
     * @return color of flower
     */
    public String getColor() {
        return color.toString();
    }
}
