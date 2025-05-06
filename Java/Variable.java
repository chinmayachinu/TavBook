public class Variable {

    int someInstanceVariable = 10;

    static int someStaticVariable = 10;

    static {
        someStaticVariable = 30;
    }

    // any number of overloaded constructor we could use
    public Variable() {
        Variable.someStaticVariable = 20;
    }

    public Variable(String value) {
        Variable.someStaticVariable = Integer.parseInt(value);
    }

    public Variable(int a, int b) {
        Variable.someStaticVariable = a + b;
        this.someInstanceVariable = a - b;
    }


    public static void main(String[] args) {

        System.out.println("value of static variable is -> " + someStaticVariable);

        someStaticVariable = 50;

        System.out.println("value of static variable after modification is -> " + someStaticVariable);

        Variable variable = new Variable();
        variable.printer();

        Variable variable1 = new Variable("2");
        variable1.printer();

        Variable variable2 = new Variable(7, 5);
        variable2.printer();

        //A variable is the name of a reserved area allocated in memory.
        int data = 50;

        /*
        Three types of variable :-
            1.local variable :- variable declared inside the body of the method
            2.instance variable :- variable declared inside the class but outside the body of the method
            3.static variable :- variable that is declared as static
        */

        Student student = new Student("Chinu", 24, "GEC");
        student.print();

        Student student1 = new Student().getStudent();
        student1.print();

    }

    void printer() {
        System.out.println("value of static variable inside non static method -> " + someStaticVariable);
        System.out.println("value of instance variable inside non static method -> " + someInstanceVariable);
    }
}

class Student {

    static String collegeName;
    String name;
    int age;

    static {
        collegeName = "GITA";
        System.out.println("Static initialization block executed.");
    }

    public Student() {
    }

    public Student(String name, int age, String collegeName) {
        this.name = name;
        this.age = age;
        Student.collegeName = collegeName;
        System.out.println("Constructor executed.");
    }

    Student getStudent() {
        var name = "chinmaya";
        return new Student(name, 24, "GITA");
    }

    void print() {
        System.out.println(this.age + " " + this.name + " " + Student.collegeName);
    }

}

/*
 * The static variable can be initialized using the static method and the constructor.
 * The static method will be executed first when the class will be loaded then the constructor.
 * so whatever value we will set to static variable inside static method will be overridden by constructor.
 */

