package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(1, 1.5, 2);
        IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);
        // iceCreamSeller.orderCone(Cone.Flavor .values());
        Magnum orderMagnumWhite = iceCreamSeller.orderMagnum(Magnum.MagnumType.ROMANTIC_STRAWBERRIES);

        Magnum orderMagnumAlpineNut = iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINE_NUT);

        IceRocket orderIceRocket = iceCreamSeller.orderIceRocket();

        Eatable[] iceCream = {orderMagnumWhite, orderMagnumAlpineNut, orderIceRocket};
        for (Eatable eatable : iceCream) {
            eatable.eat();
            System.out.println(iceCreamSeller.getProfit());// problem in this line
        }

    }
}

