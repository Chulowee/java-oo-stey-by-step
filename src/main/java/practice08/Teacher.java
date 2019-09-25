package practice08;

public class Teacher extends Person {

    private Klass teacKlass;

    public Teacher(int i, String name, int age, Klass klass) {
        super(i, name, age);
        teacKlass = klass;
    }

    public Teacher(int i, String name, int age) {
        super(i, name, age);
    }

    public Klass getKlass() {
        return this.teacKlass;
    }

    @Override
    public String introduce() {
        if (teacKlass == null) {
            return super.introduce().concat(" I am a ")
                    .concat(practice06.Teacher.class.getSimpleName())
                    .concat(".")
                    .concat(" I teach No Class.");
        } else {
            return super.introduce().concat(" I am a ")
                    .concat(practice06.Teacher.class.getSimpleName())
                    .concat(".")
                    .concat(" I teach Class ")
                    .concat(String.valueOf(teacKlass.getNumber()))
                    .concat(".");
        }
    }

    public String introduceWith(Student student) {
        if (teacKlass.getNumber() == student.getKlass().getNumber()) {
            return super.introduce().concat(" I am a ")
                    .concat(practice06.Teacher.class.getSimpleName())
                    .concat(".")
                    .concat(" I teach ")
                    .concat(student.getName())
                    .concat(".");
        } else {
            return super.introduce().concat(" I am a ")
                    .concat(practice06.Teacher.class.getSimpleName())
                    .concat(".")
                    .concat(" I don't teach ")
                    .concat(student.getName())
                    .concat(".");
        }
    }
}
