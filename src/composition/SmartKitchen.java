package composition;

import java.util.Objects;
import java.util.Random;

public class SmartKitchen {
    private Oven oven;
    private DishWasher dishWasher;
    private Refrigerator fridge;

    private CoffeeMaker coffeeMaker;

    private void addWater(){
        fridge.orderFood();
    }
    private void pourMilk(){
        coffeeMaker.brewCoffee();
    }
    private void loadDishWasher(){
        dishWasher.doDishes();
    }
    public void doKitchenWork(){
        String[] appliances = {"fridge", "dishWasher", "coffeeMaker"};
        Random rand = new Random();
        String randomAppliance = appliances[rand.nextInt(appliances.length)];
        makeApplianceWork(randomAppliance);
    }

    private void makeApplianceWork(String applianceName){
        if(Objects.equals(applianceName, "fridge")){
            fridge = new Refrigerator();
            fridge.setHasWorkTodo(true);
            addWater();
            fridge.setHasWorkTodo(false);
        } else if (Objects.equals(applianceName, "dishWasher")) {
            dishWasher = new DishWasher();
            dishWasher.setHasWorkTodo(true);
            loadDishWasher();
            dishWasher.setHasWorkTodo(false);
        } else if (Objects.equals(applianceName, "coffeeMaker")) {
            coffeeMaker = new CoffeeMaker();
            coffeeMaker.setHasWorkTodo(true);
            pourMilk();
            coffeeMaker.setHasWorkTodo(false);
        }
    }
}
