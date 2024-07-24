package interface_practice;

public class InterfaceTester {
    public static void main(String[] args) {
        ISaveable cakeRecipeIngredients = new Ingredients();
        cakeRecipeIngredients.populateStorage();
        cakeRecipeIngredients.saveToStorage();
    }
}
