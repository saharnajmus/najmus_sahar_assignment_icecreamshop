package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements Profitable, IceCreamSeller {
    private PriceList priceList;
    private double totalProfit;
    //  public IceCreamSalon(){
    //  priceList = new PriceList();
    // }

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        Cone cone = new Cone(balls);
        for (Cone.Flavor ball : balls) {
            double price = priceList.getBallPrice();
            totalProfit = (price * 5) / 100;
        }
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        double price = priceList.getRocketPrice();
        totalProfit = (price * 8) / 100;
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        double price = priceList.getMagnumPrice(magnumType);
        totalProfit = (price * 10) / 100;
        return magnum;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }
}
