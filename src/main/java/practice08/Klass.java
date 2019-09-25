package practice08;

public class Klass {
    private int number;
    private String displayName;
    private Student lead;

    public Klass(int klassNumber) {
        number = klassNumber;
        displayName = "Class ".concat(String.valueOf(klassNumber));
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Student getLeader() {
        return lead;
    }

    public Student assignLeader(Student leader) {
        return  lead = leader;
    }
}
