public class Super {

    // super could be used to get the parent class instance variable
    // super could be used to call the parent class constructor
    // super could be used to invoke the parent class method

    public static void main(String[] args) {
        SuperClassExtendExample extendExample = new SuperClassExtendExample();
        extendExample.printInChildClass();
        extendExample.superTestMethod();
    }
}


class SuperExample {

    public SuperExample() {
        System.out.println("super class constructor");
    }
    int a = 10;

    void superTestMethod () {
        System.out.println("Super class method");
    }
}

class SuperClassExtendExample extends SuperExample {

    int a = 20;

    public SuperClassExtendExample() {
        System.out.println("derived class constructor");
    }

    void printInChildClass () {
        super.superTestMethod();
        System.out.println("Derived class method");

        System.out.println(super.a);
        System.out.println(a);
    }
}