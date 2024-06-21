package encapsulation;

public class Player {
    private String name;
    private Health health;
    private String weapon;

    public Player(String name, Health health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void loseHealth(int removeHealthAmount){
        health.setHealth(health.getHealth()-removeHealthAmount);
    }
    public void restoreHealth(int addHealthAmount){
        health.setHealth(health.getHealth()+addHealthAmount);
    }
    public int healthRemaining(){
        return health.getHealth();
    }
}
