package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(1.5, 2, 2.5);
        Stock stock = new Stock(20, 8, 70, 50);
        IceCreamSeller iceCreamSeller = new IceCreamCar(priceList, stock);
        Magnum orderMagnumWhite = iceCreamSeller.orderMagnum(Magnum.MagnumType.ROMANTIC_STRAWBERRIES);

        Magnum orderMagnumAlpineNut = iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINE_NUT);

        IceRocket orderIceRocket = iceCreamSeller.orderIceRocket();
        Cone orderCone = iceCreamSeller.orderCone(Cone.Flavor.values());
        Eatable[] iceCream = {orderMagnumWhite, orderMagnumAlpineNut, orderIceRocket, orderCone};
        for (Eatable eatable : iceCream) {
            eatable.eat();
            System.out.println(iceCreamSeller.getProfit());// problem in this line
        }

    }
}
