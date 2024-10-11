package flower.store;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Chamomile extends Flower {
    public Chamomile(final double sepalLength,
        final FlowerColor color, final  double price) {
        super(sepalLength, color, price, FlowerType.CHAMOMILE);
    }
}
