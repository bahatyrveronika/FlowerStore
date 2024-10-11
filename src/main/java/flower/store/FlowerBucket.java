package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class FlowerBucket {
    /**
     * list FlowerPacks.
     */
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    /**
    adds one pack.
     *
     * @param pack pack
     */
    public void add(final FlowerPack pack) {
        this.flowerPacks.add(pack);
    }

    /**
     * total price of the flower packs.
     *
     * @return total price of all flower packs.
     */
    public double getPrice() {
        return flowerPacks.stream()
            .mapToDouble(FlowerPack::getPrice)
            .sum();
    }

}
