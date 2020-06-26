package pl.camp.it.db;

import pl.camp.it.model.Dog;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Persistance {

    private static final String fileName = "/Users/lukaszcholewa/IdeaProjects/psy.txt";

    public static void saveData() {
        try {
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            boolean flag = false;
            for (Dog dogs : DogRepository.getDogrepository().getDogs()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder
                        .append("Imie psa: ")
                        .append(dogs.getName())
                        .append(" Wiek: ")
                        .append(dogs.getAge());
                if (flag) {
                    bufferedWriter.newLine();
                }
                flag = true;
                bufferedWriter.append(stringBuilder.toString());
            }
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
