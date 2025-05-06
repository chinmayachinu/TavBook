import java.util.Random;

public class Aggregation {

    /*
     * 1. If a class has entity reference then it is known as Aggregation.
     * 2. It is called Has-A relationship.
     * e.g A building has bricks.
     *
     * It is best to use Aggregation if there is not IS-A relationship.
     */

    public static void main(String[] args) {

        Laptop laptop = new Laptop("MacBook Pro", "Apple");
        Person person = new Person("Chinmaya", laptop);

        double avgScreenTimeOfPerson = person.avgScreenTimeOfPerson();

        var message = person.shouldRestrictPersonFromConsumingLaptop(avgScreenTimeOfPerson) ?
                "Hey! Sleep you have used your Laptop more than 8 hr. " : "Your screen time is below 8 hr.";

        System.out.println(message + " Screen time => " + person.laptop.screenTime);
    }
}

class Person {

    String name;

    Laptop laptop;

    public Person(String name, Laptop laptop) {
        this.name = name;
        this.laptop = laptop;
    }

    double avgScreenTimeOfPerson() {
        return this.laptop.getAvgScreenTime();
    }

    boolean shouldRestrictPersonFromConsumingLaptop(double screenTime) {
        // if greater than 8 hour then return yes otherwise false
        return screenTime > 8;
    }
}

class Laptop {
    String name;
    String brand;

    double screenTime;

    private void setScreenTime(double screenTime) {
        this.screenTime = screenTime;
    }

    public Laptop(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public double getAvgScreenTime() {
        this.setScreenTime(new Random().nextDouble(10));
        return this.screenTime;
    }
}
