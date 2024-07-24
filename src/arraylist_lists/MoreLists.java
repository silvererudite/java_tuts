package arraylist_lists;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "oranges", "bananas", "milk","eggs"};
        List<String> list = new ArrayList<>(List.of(items));
        System.out.println(list);
        System.out.println(list.getClass());
        list.add("Sausages");
        System.out.println(list);
    }
}
