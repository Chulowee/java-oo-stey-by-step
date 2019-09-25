package practice09;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class Klass {
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
        if (students.contains(student.getName())) {
            this.student = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return student;
    }

    public void appendMember(Student student) {
        this.students.add(student.getName());
    }
}
