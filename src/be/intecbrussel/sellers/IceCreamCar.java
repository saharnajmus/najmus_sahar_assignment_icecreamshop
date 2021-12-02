package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit;


    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        Cone cone = new Cone(balls);
        cone = prepareCone(balls);
        return cone;
    }

    public Cone prepareCone(Cone.Flavor[] balls) throws NoMoreIceCreamException {
        Cone cone = new Cone(balls);

        for (Cone.Flavor ball : balls) {
            double price = priceList.getBallPrice();
            profit = (price * 5) / 100;
        }
        if (stock.getCones() == 0 || stock.getBalls() == 0)
            throw new NoMoreIceCreamException("no more cones");

        return cone;

    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        iceRocket = prepareIceRocket();
        return iceRocket;

    }

    public IceRocket prepareIceRocket() throws NoMoreIceCreamException {
        IceRocket iceRocket = new IceRocket();
        double price = priceList.getRocketPrice();
        profit = (price * 8) / 100;
        if (stock.getIceRocket() == 0) {
            throw new NoMoreIceCreamException("there is no more Rocket ice cream");
        }
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        magnum = prepareMagnum(magnumType);
        return magnum;

    }

    public Magnum prepareMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException {
        Magnum magnum = new Magnum(magnumType);
        double price = priceList.getMagnumPrice(magnumType);
        profit = (price * 10) / 100;
        if (stock.getMagni() == 0) {
            throw new NoMoreIceCreamException("there is no more MAGNUM");
        }

        return magnum;
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
