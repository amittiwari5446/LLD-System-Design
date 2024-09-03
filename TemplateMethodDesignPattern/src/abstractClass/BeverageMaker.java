package abstractClass;

public abstract class BeverageMaker {
    //template method defining overall process
    public final void makeBeverage(){
        boilWater();
        breaw();
        pourInCup();
        addCondiments();
    }

    public abstract void addCondiments();
    public abstract void breaw();

    //common methods
    private void boilWater() {
        System.out.println("Boiling Water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
