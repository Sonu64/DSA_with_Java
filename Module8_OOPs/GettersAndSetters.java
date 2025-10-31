public class GettersAndSetters {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Sonu");
        person1.setAge(22);
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Now changing Name...");
        person1.setName("Sourakanti");
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
    }
}

class Person {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return this.name;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
