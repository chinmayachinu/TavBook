public class InnerClassOrInterface {
    // inner class can access all the data members of outer class, including private
    // data members and methods

    int age = 30;

    static String version = "PRO";

    class Human {
        void print() {
            System.out.println("age is => " + age);
        }
    }

    class Dog {
        void print() {
            System.out.println("age is => " + age);
        }
    }

    static class Laptop {
        void getLaptopName () {
            System.out.println("MacBook " + version);
        }

        static void printBanner () {
            System.out.println("welcome........");
        }
    }

    public static void main(String[] args) {
        InnerClassOrInterface innerClassOrInterface = new InnerClassOrInterface();

        InnerClassOrInterface.Human human = innerClassOrInterface.new Human();
        InnerClassOrInterface.Dog dog = innerClassOrInterface.new Dog();

        human.print();
        dog.print();

        String name = "Local inner class";

        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("This is Anonymous Inner Class");
            }
        };

        printer.print();

        Chin chin = new Chin() {
            @Override
            void printName() {
                System.out.println("Name is Chinmaya");
            }
        };

        chin.printAge();
        chin.printName();

        class Local{
            int age = 20;

            void localPrinter () {
                chin.printName();
                dog.print();
                human.print();
                System.out.println(name);
            }
        }

        System.out.println(innerClassOrInterface.age);
        System.out.println(new Local().age);


        InnerClassOrInterface.Laptop laptop = new InnerClassOrInterface.Laptop();
        laptop.getLaptopName();
        InnerClassOrInterface.Laptop.printBanner();
    }
}

interface Printer {
    void print();
}

abstract class Chin {
    abstract void printName ();
    void printAge () {
        System.out.println("age is => " + 25);
    }

}