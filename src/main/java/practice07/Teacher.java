package practice07;

public class Teacher extends Person{

    private Klass teacKlass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        teacKlass = klass;
    }

    public Klass getKlass() {
        return this.teacKlass;
    }

    @Override
    public String introduce() {
        if (teacKlass == null){
            return introduction()
                    .concat(" I teach No Class.");
        } else{
            return introduction()
                    .concat(" I teach Class ")
                    .concat(String.valueOf(teacKlass.getNumber()))
                    .concat(".");
        }
    }

    public String introduceWith(Student student) {
        if (teacKlass.getNumber() == student.getKlass().getNumber()){
            return introduction()
                    .concat(" I teach ")
                    .concat(student.getName())
                    .concat(".");
        } else {
            return introduction()
                    .concat(" I don't teach ")
                    .concat(student.getName())
                    .concat(".");
        }
    }

    private String introduction() {
        return super.introduce().concat(" I am a ")
                .concat(practice06.Teacher.class.getSimpleName())
                .concat(".");
    }
}
