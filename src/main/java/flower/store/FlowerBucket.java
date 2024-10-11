package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack pack) {
        this.flowerPacks.add(pack);
    }

    public double getPrice() {
        return flowerPacks.stream()
            .mapToDouble(FlowerPack::getPrice)
            .sum();
    }

}
