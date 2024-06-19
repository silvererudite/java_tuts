package inheritance;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(String type, double weight){
        this(type, weight, "perky", "curled");
    }
    public Dog(String type, String size, double weight){
        super(type, size, weight);
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "smol":(weight > 35 ? "smol chonk" :"big boy"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    private void bark(){
        System.out.println(type + " Woofs");
    }
    private void run(){
        System.out.println(type+" runs");
    }
    private void walk(){
        System.out.println(type+" walks");
    }
    private void wagTail(){
        System.out.println(type+ " wags tail");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
            wagTail();
        }
    }
}
