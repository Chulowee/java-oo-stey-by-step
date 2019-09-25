package practice07;

public class Klass{
    private int number;
    private String displayName;

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
}
