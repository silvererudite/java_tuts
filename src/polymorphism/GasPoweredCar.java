package polymorphism;

public class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}
