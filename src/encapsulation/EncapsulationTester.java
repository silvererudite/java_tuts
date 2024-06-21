package encapsulation;

public class EncapsulationTester {
    public static void main(String[] args) {
        Health ashHealth = new Health(100);
        Player ash = new Player("Ash", ashHealth, "shotgun");
        System.out.println("Power remaining: "+ ash.healthRemaining());
        ash.loseHealth(10);
        System.out.println("Power remaining now: "+ ash.healthRemaining());
    }
}
