package practice07;

public class Student extends Person {

    Klass studentKlass;
    public Student(String name, int age, Klass klass) {
        super(name, age);
        studentKlass = klass;
    }

    public Klass getKlass() {
        return this.studentKlass;
    }

    public String introduce() {
        return super.introduce().concat(" I am a Student. I am at Class ")
                .concat(String.valueOf(studentKlass.getNumber()).concat("."));
    }
}
