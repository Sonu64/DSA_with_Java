public class Constructors {
    public static void main(String[] args) {
        // Constructor Overloading - Example of Polymorphism
        Student s1 = new Student(); // Unparameterized-constructor will be called
        Student s2 = new Student("Sourakanti"); // If we know only the Name of the Student but not the Roll Number
        Student s3 = new Student(51); // If we know only the Roll Number of the Student and not his/her name
    }
}
class Student {
    private String name;
    private int roll;

    // Non-Parameterized constructor
    Student() {
        System.out.println("A Student object is created :) ");
    }
    /* Parameterized constructor */
    // If we know only the Name of the Student but not the Roll Number
    Student(String name) {
        this.name = name;
    }
    // If we know only the Roll Number of the Student and not his/her name
    Student(int roll) {
        this.roll = roll;
    }
}
