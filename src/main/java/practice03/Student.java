package practice03;

public class Student extends Person{

    int studentKlass;

    public Student(String name, int age, int klass) {
        super(name, age);
        studentKlass = klass;
    }

    public int getKlass() {
        return studentKlass;
    }

    public String introduce() {
        return "I am a Student. I am at Class ".concat(String.valueOf(studentKlass).concat("."));
    }
}
