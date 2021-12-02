package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {
        this(1, 1, 1);
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        setBallPrice(ballPrice);
        setRocketPrice(rocketPrice);
        setMagnumStandardPrice(magnumStandardPrice);
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumStandardPrice() {
        return magnumStandardPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType magnumType) {
        double magnumPrice = 0.0;
        for (Magnum.MagnumType type : Magnum.MagnumType.values()) {
            if (type.equals(Magnum.MagnumType.MILK_CHOCOLATE)) {
                magnumPrice = magnumStandardPrice + 0.5;
            } else if (type.equals(Magnum.MagnumType.BLACK_CHOCOLATE)) {
                magnumPrice = magnumStandardPrice + 1;
            } else if (type.equals(Magnum.MagnumType.WHITE_CHOCOLATE)) {
                magnumPrice = magnumStandardPrice * 1.2;

            } else if (type.equals(Magnum.MagnumType.ALPINE_NUT)) {
                magnumPrice = magnumStandardPrice * 1.5;
            } else if (type.equals(Magnum.MagnumType.ROMANTIC_STRAWBERRIES)) {
                magnumPrice = magnumStandardPrice * 2;
            }
        }
        return magnumPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }
}
