package flower.store;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
public class Rose extends Flower {

    public Rose(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, price, FlowerType.ROSE);
    }

    public Rose() {
        super(0.0, FlowerColor.RED, 10, FlowerType.ROSE); // Встановіть значення за замовчуванням
    }
}
