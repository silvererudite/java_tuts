package composition;

public class CoffeeMaker {
    private boolean hasWorkTodo;

    public void brewCoffee(){
        System.out.println("Brewing coffee now");
    }

    public boolean isHasWorkTodo() {
        return hasWorkTodo;
    }

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }
}
