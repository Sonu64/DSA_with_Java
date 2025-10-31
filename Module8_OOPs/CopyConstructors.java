public class CopyConstructors {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jimmy", 34);
        Employee e2 = new Employee(e1);
        System.out.println("Employee 1 Details:\nName: " + e1.name + "\nAge: " + e1.age);
        System.out.println("\nEmployee 2 Details:\nName: " + e2.name + "\nAge: " + e2.age);
    }
}

class Employee {
    String name;
    int age;

    // Normal Parameterized constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Employee(Employee otherEmpObject) {
        this.name = otherEmpObject.name;
        this.age = otherEmpObject.age;
    }
}
