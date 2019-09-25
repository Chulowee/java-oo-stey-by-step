package practice06;

public class Teacher extends Person {

    private int teacherKlass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        teacherKlass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return this.teacherKlass;
    }

    @Override
    public String introduce() {
        if (teacherKlass == 0){
            return super.introduce().concat(" I am a ")
                    .concat(Teacher.class.getSimpleName())
                    .concat(".")
                    .concat(" I teach No Class.");
        } else{
            return super.introduce().concat(" I am a ")
                    .concat(Teacher.class.getSimpleName())
                    .concat(".")
                    .concat(" I teach Class ")
                    .concat(String.valueOf(teacherKlass))
                    .concat(".");
        }
    }
}
