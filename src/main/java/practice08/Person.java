package practice08;

public class Person {

    private int personAge;
    private String personName;
    private int num;

    public Person(int i, String name, int age) {
        num = i;
        personAge = age;
        personName = name;
    }

    public String getName() {
        return this.personName;
    }

    public int getAge() {
        return this.personAge;
    }

    public String introduce() {
        return "My name is ".concat(personName).concat(". I am ")
                .concat(String.valueOf(personAge)).concat(" years old.");
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Person){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {return num;};
}
