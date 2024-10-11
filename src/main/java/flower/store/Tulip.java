package flower.store;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Tulip extends Flower {
    public Tulip(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, price, FlowerType.TULIP);
    }
}
