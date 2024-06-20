package string_builder;

public class ExampleStringBuilder {
    public static void main(String[] args) {
        String name = "Shamima";
        String newName = name.concat("Hossain");
        StringBuilder nameBuilder = new StringBuilder("Shamima");
        nameBuilder.append("Hossain");

        printInfo(name);
        System.out.println("=========================");
        printInfo(newName);
        System.out.println("=========================");
        printInfo(nameBuilder);

        StringBuilder startEmpty = new StringBuilder();
        startEmpty.append("a".repeat(17));
        StringBuilder startEmpty2 = new StringBuilder(32);
        startEmpty2.append(17);
        System.out.println("=========================");
        printInfo(startEmpty);
        printInfo(startEmpty2);
    }
    public static void printInfo(String someString){
        System.out.println("String = " + someString);
        System.out.println("length = "+ someString.length());
    }

    public static void printInfo(StringBuilder someString){
        System.out.println("String = " + someString);
        System.out.println("length = "+ someString.length());
        System.out.println("capacity = "+ someString.capacity());
    }
}
