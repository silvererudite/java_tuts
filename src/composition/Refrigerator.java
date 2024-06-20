package composition;

public class Refrigerator {
    private boolean hasWorkTodo;

    public void orderFood(){
        System.out.println("Ordering food now");
    }

    public boolean isHasWorkTodo() {
        return hasWorkTodo;
    }

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }
}
