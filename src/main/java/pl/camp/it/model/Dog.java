package pl.camp.it.model;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Dog {

    private String name;
    private int age;

    public Dog() {
        this.name = RandomStringUtils.randomAlphabetic(10);
        this.age = RandomUtils.nextInt(1,20);
    }

    public String getName() { return this.name; }

    public int getAge() { return this.age; }
}
