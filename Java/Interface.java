public class Interface {
    // Interface give 100 % abstraction
    // always used with keyword interface
    // Interface can not be instantiated
    // all the variables in the interface should be public static final
    // all the abstract methods in the interface should be public abstract
    // from java 8 interface could have static method as well as default method
    // from java 9 we could have private method also in the interface

    public static void main(String[] args) {
        A6 obj = new A6();
        Printable.banner();
        obj.print();
        System.out.println(obj.sizeOfPrinter());

        AbstractPrinter printable = new PrintWithMusicPrinter();
        Printable.banner();
        printable.print();
        System.out.println(printable.sizeOfPrinter());
        printable.musicWhilePrinting();
    }
}


interface Printable {

    String BRAND = "Sony";

    void print();

    default int sizeOfPrinter() {
        return getSize();
    }

    static void banner() {
        System.out.println(BRAND + " Printer Makes Your Life Better >>>>>>>>>>>>>>>");
    }

    private int getSize() {
        return 10;
    }

}

class A6 implements Printable {
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public int sizeOfPrinter() {
        return 320;
    }
}

abstract class AbstractPrinter implements Printable {
    public void print() {
        System.out.println("Hello from Abstract Printer");
    }

    @Override
    public int sizeOfPrinter() {
        return 30;
    }

    abstract void musicWhilePrinting();
}

class PrintWithMusicPrinter extends AbstractPrinter {

    @Override
    void musicWhilePrinting() {
        System.out.println("Playing music while printing");
    }
}