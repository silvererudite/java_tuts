package refs_values;

import java.util.Arrays;

public class VarArgs {

    private static void printText(String... textList){
        for (String t: textList) {
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World again");
        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("hello", "world", "again");

    }
}
