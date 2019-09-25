package practice08;

public class Student extends Person{

    Klass studentKlass;
    int age;
    
    public Student(int i, String leader, int i1, Klass klass) {
        super(i, leader, i1);
        studentKlass = klass;
    }

    public Klass getKlass() {
        return this.studentKlass;
    }

    public String introduce() {
        if (studentKlass.getLeader() == null){
            return super.introduce().concat(" I am a Student. I am at Class ")
                    .concat(String.valueOf(studentKlass.getNumber()).concat("."));
        } else {
            return super.introduce().concat(" I am a Student. I am Leader of Class ")
                    .concat(String.valueOf(studentKlass.getNumber()).concat("."));
        }
    }
}
