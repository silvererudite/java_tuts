package encapsulation;

public class Health {
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health <=0 ){
            this.health = 1;
            System.out.println("Player reset");
        } else if (health > 100) {
            this.health = 100;
            System.out.println("Player's powers fully restored");
        }else {
            this.health = health;
        }
    }

    Health(int health){
        if(health <=0 ){
            this.health = 1;
        } else this.health = Math.min(health, 100);
    }
}
