public class Abstraction {

    // abstract class
    // interface - 100 % abstraction

    // Abstract class : -
    // 1. we could have both abstract method and concrete method
    // 2. we could not instantiate abstract class
    // 3. we could have method inside abstract class
    // 4. It can have constructor and static method also
    // 5. It should use abstract keyword

    public static void main(String[] args) {
        Boy boy = new Boy() {
            @Override
            void printName() {
                System.out.println("Temporary boy");
            }

            @Override
            void printAge() {
                System.out.println("Temporary age");
            }
        };
        boy.printAge();
        boy.printName();
        boy.talks();

        Children chinmaya = new Chinmaya();
        chinmaya.printAge();
        chinmaya.printName();
        chinmaya.talks();
        int a = chinmaya.a;
        System.out.println("a is => " + a);
        Boy.sayHello();
    }
}

abstract class Boy {
    final int a;
    static final int v = 1;
    protected Boy () {
        a = 10;
        System.out.println("abstract class constructor a = " + a);
    }

    abstract void printName();
    abstract void printAge();

    final void talks(){
        System.out.println("each boy talks");
    }

    static void sayHello() {
        System.out.println("Hello........ v => " + v);
    }
}

abstract class Children extends Boy {

}

class Chinmaya extends Children {

    @Override
    void printName() {
        System.out.println("My name is Chinmaya");
    }

    @Override
    void printAge() {
        System.out.println("Age is 24");
    }

}





// class and object
// inheritance
// polymorphism
// abstraction
// encapsulation