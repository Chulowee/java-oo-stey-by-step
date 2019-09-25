package practice09;

import static java.lang.String.format;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return format("My name is %s. I am %d years old.", name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return obj.hashCode() == hashCode();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }
}
