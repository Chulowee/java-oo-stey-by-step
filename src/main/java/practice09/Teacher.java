package practice09;

import static java.lang.String.format;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass == null){
            return super.introduce() + format(" I am a Teacher. I teach No Class.");
        }
        return super.introduce() +
                format(" I am a Teacher. I teach Class %d.", klass.getNumber());
    }

    public String introduceWith(Student student) {
        if (student.getKlass() == this.getKlass()){
            return super.introduce() + format(" I am a Teacher. I teach %s.", student.getName());
        }
        return super.introduce() + format(" I am a Teacher. I don't teach %s.", student.getName());
    }
}
