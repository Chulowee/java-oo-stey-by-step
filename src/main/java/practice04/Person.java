package practice04;

public class Person {

    private final int personAge;
    private final String personName;

    public Person(String name, int age) {
        personName = name;
        personAge = age;
    }

    public String getName() {
        return personName;
    }

    public int getAge() {
        return personAge;
    }

    public String introduce() {
        return backIntroduce();
    }

    public String backIntroduce() {
        return "My name is ".concat(personName).concat(". I am ")
                .concat(String.valueOf(personAge)).concat(" years old.");
    }
}
