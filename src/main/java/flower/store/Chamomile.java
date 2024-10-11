package flower.store;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Клас, що представляє ромашку.
 */
@Getter @Setter @NoArgsConstructor
public class Chamomile extends Flower {
    /**
     * Конструктор для створення об'єкта Chamomile.
     *
     * @param sepalLength Довжина чашолистка квітки.
     * @param color Колір квітки.
     * @param price Ціна квітки.
     */
    public Chamomile(final double sepalLength,
        final FlowerColor color, final  double price) {
        super(sepalLength, color, price, FlowerType.CHAMOMILE);
    }
}
