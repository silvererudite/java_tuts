package polymorphism;

public class Car {
    private String description;


    public void startEngine(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(instanceType+"'s engine started");
    }
    public void drive(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println("Driving a " + instanceType);
    }
    protected void runEngine(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(instanceType + "'s engine running");
    }
}
