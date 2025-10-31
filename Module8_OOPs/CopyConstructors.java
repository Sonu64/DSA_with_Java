public class CopyConstructors {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jimmy", 34);
        Employee employee2 = new Employee(employee1);
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
