package SimDucks;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuakBehavior quakBehavior;

    public Duck() { }

    public void setQuakBehavior(QuakBehavior qb) {
        this.quakBehavior = qb;
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public abstract void display();

    public void performFly(){ flyBehavior.fly(); }
    public void performQuak(){ quakBehavior.quak();}

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }


}
