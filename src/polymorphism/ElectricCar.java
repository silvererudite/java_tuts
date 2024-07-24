package polymorphism;

public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

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
