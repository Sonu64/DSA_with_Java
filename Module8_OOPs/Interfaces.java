public class Interfaces {
    public static void main(String[] args) {
        Gaddi g1 = new Gaddi();
        Door d1 = new Door();
        g1.lock();
        g1.unlock();
        d1.lock();
        d1.unlock();

        SmartWatch myWatch = new SmartWatch();
        myWatch.getLocation();
        myWatch.plugin();
        myWatch.getBatteryLevel();
    }
}

/* Achieving 100% Abstraction where the methods will have totally different implementation
* while any class implements from this interface */
interface Lockable {
    public void lock();
    public void unlock();
}

class Gaddi implements Lockable {
    public void lock() {
        System.out.println("Complex Car Locking Mechanism started.");
    }
    public void unlock() {
        System.out.println("Complex Car Unlocking Mechanism started.");
    }
}

class Door implements Lockable {
    public void lock() {
        System.out.println("Simple Door Locking Mechanism started.");
    }
    public void unlock() {
        System.out.println("Simple Door Unlocking Mechanism started.");
    }
}

/* Achieving Multiple-Inheritance through interfaces */
interface Trackable {
    // By default public, static and final
    String TRACKING_TYPE = "GPS";
    // By default public method
    void getLocation();
}

interface Chargeable {
    public void plugin();
    public void getBatteryLevel();
}

class SmartWatch implements Trackable, Chargeable {

    // This concrete class must implement all methods from both interfaces

    @Override
    public void getLocation() {
        System.out.println("Current Smartwatch Location is being tracked by " + TRACKING_TYPE);
    }

    @Override
    public void plugin() {
        System.out.println("Plugged In Smartwatch for charging.");
    }

    @Override
    public void getBatteryLevel() {
        System.out.println("Getting Battery Level of Smartwatch.");
    }
}