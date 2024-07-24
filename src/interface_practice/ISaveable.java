package interface_practice;

import java.util.ArrayList;

public interface ISaveable {
    public void saveToStorage();
    public void populateStorage();

    public ArrayList<String> readValues();
}
