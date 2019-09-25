package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import static java.lang.String.format;

public class Klass extends Observable {
    private int number;
    private Student student;
    private List<String> students = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return format("Class %d", number);
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() != this.number) {
            System.out.print("It is not one of us.\n");
        } else {
            this.student = student;
            setChanged();
            notifyObservers(student);
        }
    }

    public Student getLeader() {
        return student;
    }

    public void appendMember(Student student) {
        student.getKlass().number = getNumber();
        this.setChanged();
        this.notifyObservers(student);
    }
}
