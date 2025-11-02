public class ShallowVsDeepCopy {
    public static void main(String[] args) {
        int salaries1[] =  {60000, 5000, 1500};
        Engineer e1 = new Engineer("Sourakanti", salaries1, "Mumbai");
        Engineer e2 = new Engineer(e1);

        System.out.print("e1 Details Initially:\nName: " + e1.getName() + "\nSalaries: \n");
        e1.getSalaries();
        System.out.println("Address: City - " + e1.getAddress().getCity());

        System.out.print("\n\ne2 Details Initially:\nName: " + e2.getName() + "\nSalaries: \n");
        e2.getSalaries();
        System.out.println("Address: City - " + e2.getAddress().getCity());


        // Changing e1 props
        int newSalariesForE1[] = {100, 100, 100};
        e1.setSalaries(newSalariesForE1);
        e1.setName("Julia");
        e1.setAddress("Chennai");

        System.out.print("\n\ne1 Details Finally:\nName: " + e1.getName() + "\nSalaries: \n");
        e1.getSalaries();
        System.out.println("Address: City - " + e1.getAddress().getCity());

        System.out.print("\n\ne2 Details Finally:\nName: " + e2.getName() + "\nSalaries: \n");
        e2.getSalaries();
        System.out.println("Address: City - " + e2.getAddress().getCity());
    }
}

class Address {
    private String city;
    public Address(String city) {
        this.city = city;
    }
    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}

class Engineer {
    private String name;
    private int salaries[];
    private Address address;

    // NORMAL CONSTRUCTOR, Using Deep Copy for the salaries[] array and address object
    public Engineer (String name, int salaries[], String city) {
        this.name = name;
        this.salaries = new int[salaries.length];
        for (int i=0; i< salaries.length; i++) {
            this.salaries[i] = salaries[i];
        }
        this.address = new Address(city);
    }

    // SHALLOW COPY CONSTRUCTOR
//    public Engineer (Engineer other) {
//        this.name = other.name;
//        this.salaries = other.salaries; // Reference copied, Shallow Copy !
//        this.address = other.address;
//    }

    // DEEP COPY CONSTRUCTOR
    public Engineer (Engineer other) {
        this.name = other.name;
        this.salaries = new int[other.salaries.length];
        for (int i=0; i<other.salaries.length; i++) {
            this.salaries[i] = other.salaries[i];
        }
        this.address = new Address(other.address.getCity());
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getSalaries() {
        for (int i=0; i<this.salaries.length; i++) {
            System.out.println(this.salaries[i] + "   ");
        }
    }
    public void setSalaries(int salaries[]) {
        this.salaries = new int[salaries.length]; // Empty new array created for deep copy again
        for (int i=0; i<salaries.length; i++) {
            this.salaries[i] = salaries[i];
        }
    }
    public Address getAddress() {
        return this.address;
    }
    public void setAddress(String city) {
        this.address.setCity(city);
    }
}
