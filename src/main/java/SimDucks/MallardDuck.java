package SimDucks;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quakBehavior = new Quak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
