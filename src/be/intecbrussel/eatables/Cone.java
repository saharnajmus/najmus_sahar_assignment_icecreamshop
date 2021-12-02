package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {
    private Flavor[] balls;

    public Cone() {
        balls = new Flavor[50];
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;

    }

    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHIO;
    }

    @Override
    public void eat() {
        System.out.println("you are eating cone with scoops of ");

        for (Flavor balls : Flavor.values()) {
            System.out.println(balls);
        }

    }

    @Override
    public String toString() {
        return "Cone{" +
                "balls=" + Arrays.toString(balls) +
                '}';
    }
}
