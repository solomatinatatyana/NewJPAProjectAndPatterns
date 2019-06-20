package SimDucks;

public class ModelDuck extends Duck {

    public ModelDuck(){
        quakBehavior = new Quak();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
