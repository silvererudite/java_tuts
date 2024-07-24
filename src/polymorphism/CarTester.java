package polymorphism;

public class CarTester {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.startEngine();
        bmw.drive();
        System.out.println("==============================");
        Car tesla = new ElectricCar();
        tesla.startEngine();
        tesla.runEngine();
        tesla.drive();
        System.out.println("==============================");
//        Object toyota =  new HybridCar();
//        GasPoweredCar gasPoweredToyota = (GasPoweredCar) toyota;
//        gasPoweredToyota.startEngine();
//        gasPoweredToyota.runEngine();
//        gasPoweredToyota.drive();
    }
}
