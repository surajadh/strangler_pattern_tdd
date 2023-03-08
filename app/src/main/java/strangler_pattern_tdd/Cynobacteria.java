package strangler_pattern_tdd;

import java.util.stream.Collectors;

public class Cynobacteria implements OldPlants {
    private Earth earth;

    public Cynobacteria(Earth earth) {
        this.earth = earth;
    }

    @Override
    public void grow() {
        var hasNutrients = false;
        hasNutrients = earth.nutrients()
                .stream()
                .filter(thing -> thing == "nitrogen")
                .collect(Collectors.toList()).size() > 0;
        if (hasNutrients){
            System.out.println("This prehistoric Cynobacteria is growing");
        } else {
            System.out.println("This growlist doesn't have things it need");
        }
    }
}
