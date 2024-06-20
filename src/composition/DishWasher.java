package composition;

public class DishWasher {
    private boolean hasWorkTodo = false;

    public void doDishes(){
        System.out.println("Doing dishes now");
    }

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public boolean isHasWorkTodo() {
        return hasWorkTodo;
    }
}
