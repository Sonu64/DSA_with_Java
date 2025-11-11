public class StaticKeyword {
    public static void main (String[] args) {
        _Student s1 = new _Student();
        s1.setName("Sourakanti");
        s1.setRoll(52);
        s1.setSchoolName("V.S.N.H.S");
        int s1Percentage = _Student.getPercentage(90, 90, 90);
        System.out.println("\nStudent Details - :\nName: " + s1.getName() + "\nRoll: " + s1.getRoll() + "\nPercentage: " + s1Percentage);

        _Student s2 = new _Student();
        s2.setName("Tumpa Sona");
        s2.setRoll(23);
        // School already assigned by s1
        int s2Percentage = _Student.getPercentage(50, 50, 100);
        System.out.println("\nStudent Details - :\nName: " + s2.getName() + "\nRoll: " + s2.getRoll() + "\nPercentage: " + s2Percentage);
    }
}

class _Student {
    private String name;
    private int roll;
    private static String schoolName;

    // Getters and Setters for name
    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }
    // Getters and Setters for roll
    int getRoll() {
        return this.roll;
    }
    void setRoll(int roll) {
        this.roll = roll;
    }
    // Getters and Setters for SchoolName
    String getSchoolName() {
        return schoolName; // this.schoolName not needed in static vars
    }
    void setSchoolName(String passedSchoolName) {
        schoolName = passedSchoolName;
    }

    // Static method whose main logic is same for all Students
    static int getPercentage (int phys, int chem, int maths) {
        return (phys + chem + maths) / 3;
    }
}