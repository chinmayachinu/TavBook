public class ClassAndObject {

    /* Each object has two characteristic :-
     * 1. State :- build in properties of an object
     * 2. Behaviour :- operations of an object
     *
     * e.g. lets say Bike is object
     * 1. State :- Bike color, Bike brand, Bike engine, Bike cc, Bike tire, Bike petrolCapacity etc
     * 2. Behaviour :- blow horn, do sound, do run at speed
     *
     * e.g So here Fruit class is a blue print of all kinds of fruits.
     * suppose lets take Mango -> true, yellow, ripen
     */

    static Fruit mango = new Fruit(true, "yellow", "riped");
    static Fruit waterMellon = new Fruit(true, "Green", "Raw");


    public static void main(String[] args) {
        System.out.println(mango);
        System.out.println(waterMellon);


        // create a copy constructor
        // this constructor is used for creating an object from another similar object
        Fruit fruit = new Fruit(mango);
        System.out.println("Fruit is a copy object from mango -> " + fruit);
        System.out.println(new Fruit());

        // this keyword can be used be return current class intance
        Fruit apple = new Fruit()
                .isSweet(true)
                .type("Raw")
                .color("Green");
        System.out.println("apple -> " + apple);
    }
}

class Fruit {
    boolean isSweet;
    String color;
    String type;


    public Fruit() { // no-args constructor // if we will not give this , java will create it by default for us
        this(false, "orange", "raw");
        System.out.println(this);
        this.hi();
        this.hello(this);
    }

    private void hello(Fruit fruit) {
        fruit.setSweet(true);
        System.out.println(fruit);
    }

    private void hi() {
        System.out.println("using this we are calling hi method");
    }

    public Fruit(boolean isSweet, String color, String type) { // parameterized constructor
        this.isSweet = isSweet;
        this.color = color;
        this.type = type;
    }

    public Fruit(Fruit fruit) {
        this.isSweet = fruit.isSweet;
        this.color = fruit.color;
        this.type = fruit.type;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void canEatableWithoutCutting() {
        // some implementation
    }

    public void checkIfRawOrRiped() {
        // some implementation
    }

    public Fruit isSweet(boolean isSweet) {
        this.isSweet = isSweet;
        return this;
    }

    public Fruit type(String type) {
        this.type = type;
        return this;
    }

    public Fruit color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "isSweet=" + isSweet +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
