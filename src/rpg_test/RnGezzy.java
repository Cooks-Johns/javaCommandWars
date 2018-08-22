package rpg_test;

import java.util.Random;

public class RnGezzy {

    private final Random randoBando;


    public RnGezzy(Random randoBando) {
        this.randoBando = randoBando;
    }

    public int d6() {
        return between(1, 6);
    }

    public int between (int minInclusive, int maxInclusive) {
        return randoBando.nextInt(1 + maxInclusive - minInclusive) + maxInclusive;
    }
}
