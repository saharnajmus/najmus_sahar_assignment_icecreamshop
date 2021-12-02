package be.intecbrussel.eatables;

public class Magnum implements Eatable {
    private MagnumType type;

    public Magnum() {
        this(MagnumType.MILK_CHOCOLATE);
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public enum MagnumType {
        MILK_CHOCOLATE,
        WHITE_CHOCOLATE,
        BLACK_CHOCOLATE,
        ALPINE_NUT,
        ROMANTIC_STRAWBERRIES;
    }

    @Override
    public void eat() {
        System.out.println("you are eating " + getType() + " Magnum");
    }

    public MagnumType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Magnum{" +
                "type=" + type +
                '}';
    }
}
