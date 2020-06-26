package pl.camp.it;

import pl.camp.it.db.Persistance;

public class App {
    public static void main(String[] args) {
        Persistance.saveData();
        System.out.println("Zapisano");
    }
}
