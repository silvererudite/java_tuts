package interface_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ingredients implements ISaveable{

    private ArrayList<String> allIngredients;
    private ArrayList<String> recipeIngredients;



    @Override
    public void  saveToStorage() {
        allIngredients.addAll(0, recipeIngredients);
    }

    @Override
    public void populateStorage() {
        recipeIngredients = readValues();
    }

    @Override
    public ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1 to enter a string\n"+"0 to quit program");
        while (!quit){
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringVal = scanner.nextLine();
                    values.add(index, stringVal);
                    index++;
                    break;
            }
        }
        System.out.println("=======" + values);
        return values;
    }

    @Override
    public String toString() {
        return recipeIngredients.toString();
    }
}
