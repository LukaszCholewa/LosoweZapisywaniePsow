package pl.camp.it.db;

import pl.camp.it.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogRepository {
    private List<Dog> dogs = new ArrayList<>();
    private static final DogRepository dogrepository = new DogRepository();

    public DogRepository() {
        for (int i =0; i<10; i++){
            dogs.add(new Dog());
        }
    }

    public List<Dog> getDogs() { return dogs; }

    public static DogRepository getDogrepository() { return dogrepository; }
}
