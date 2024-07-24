package polymorphism;

public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    HybridCar(){

    }
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
