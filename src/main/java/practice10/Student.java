package practice10;

import static java.lang.String.format;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if (klass.getLeader() == null){
            return super.introduce() +
                    format(" I am a Student. I am at Class %d.", klass.getNumber());
        }else if (klass.getLeader() == this){
            return super.introduce() +
                    format(" I am a Student. I am Leader of Class %d.", klass.getNumber());
        }
        return super.introduce();
    }
}

