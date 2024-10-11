package flower.store;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Chamomile extends Flower {
    public Chamomile(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, price, FlowerType.CHAMOMILE);
    }
}
