package practice11;

import java.util.*;

import static java.lang.String.format;

public class Teacher extends Person implements Observer {
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
            this.linkedList.forEach(klass1 -> klass1.addObserver(this));
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
            List<Integer> klassNum = new ArrayList<>();
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
            for (Klass klass : linkedList){
                if (student.isIn(klass)){
                    System.out.print("I am " + getName() + ". I know " + student.getName() + " has joined " +
                            student.getKlass().getDisplayName() + ".\n");
                }

                if (klass.getLeader() != null) {
                    System.out.print("I am " + getName() + ". I know " + student.getName() + " become Leader of " +
                            student.getKlass().getDisplayName() + ".\n");
                }

            }
            return this.linkedList.contains(student.getKlass());
        }

    @Override
    public void update(Observable o, Object arg) {
        Student student = (Student)arg;
        isTeaching(student);
    }
}
