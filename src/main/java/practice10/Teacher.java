package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.String.format;

public class Teacher extends Person{
    private LinkedList<Klass> linkedList = new LinkedList<>();
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id,name,age);
        this.linkedList = linkedList;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (linkedList.isEmpty()){
            return super.introduce() + format(" I am a Teacher. I teach No Class.");
        }
        return super.introduce() +
                format(" I am a Teacher. I teach Class %s.", getKlassNumber());
    }

    private String getKlassNumber() {
        List <Integer> klassNum = new ArrayList<>();
        for (Klass klass : linkedList){
            klassNum.add(klass.getNumber());
        }
        return klassNum.toString().replace("[", "").replace("]", "");
    }

    public String introduceWith(Student student) {
        if (this.linkedList.contains(student.getKlass())){
            return super.introduce() + format(" I am a Teacher. I teach %s.", student.getName());
        }
        return super.introduce() + format(" I am a Teacher. I don't teach %s.", student.getName());
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public boolean isTeaching(Student student) {
        if (this.linkedList.contains(student.getKlass())){
            return true;
        }
        return false;
    }
}

