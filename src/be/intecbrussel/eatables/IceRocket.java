package be.intecbrussel.eatables;

public class IceRocket implements Eatable {
    @Override
    public String toString() {
        return "IceRocket{}";
    }

    public IceRocket() {
        //System.out.println("you have ordered a Rocket Ice cream");
        super();
    }

    @Override
    public void eat() {
        System.out.println("You are eating a rocket ice cream");
    }
}
