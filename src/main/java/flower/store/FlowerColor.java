package flower.store;
/**
 * Flower colors.
 */
public enum FlowerColor {
    /**
     * Color representing red flowers.
     */
    RED("#FF0000"),
    /**
     * Color representing blue flowers.
     */
    BLUE("#0000FF");

    /**
     * the color in hex format.
     */
    private final String stringRepresentation;

    /**
     * Constructs a FlowerColor.
     *
     * @param stringRepresent the hex color code
     */
    FlowerColor(final String stringRepresent) {
        this.stringRepresentation = stringRepresent;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
