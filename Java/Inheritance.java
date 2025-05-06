public class Inheritance {

    public static void main(String[] args) {

        CardPayment cardPayment = new CardPayment();
        cardPayment.amount = 10;
        cardPayment.cardNumber = 123456;
        cardPayment.cvv = 4343;
        cardPayment.expiry = "04/29";

        cardPayment.doPayment();
        cardPayment.sendConfirmationEmail();
        CardPayment.doFraudCheck();

        Payment parent = new CardPayment();
        parent.doPostPaymentCheck();
        Payment.doFraudCheck();

        UpiPayment upiPayment = new UpiPayment();
        upiPayment.amount = 20;
        upiPayment.receiverMobileNumber = 1234566789;

        upiPayment.doPayment();
        upiPayment.sendConfirmationMessage();


        Child child = new Child();  // constructor chaining
        System.out.println("child name -> " + child.name);
        ChildSon childSon = new ChildSon();
        System.out.println("child son name -> " + childSon.name);
    }
}

class Payment {

    int amount;

    public void doPayment() {
        System.out.println("Payment logic.....");
    }

    static public void doFraudCheck() {
        System.out.println("Parent fraud check");
    }

    public void doPostPaymentCheck() {
        System.out.println("Parent do post payment check");
    }

}

class CardPayment extends Payment { // IS-A relationship
    long cardNumber;
    int cvv;
    String expiry;

    public void sendConfirmationEmail() {
        System.out.println("Send the confirmation mail");
    }

    public static void doFraudCheck() { //hidden :- static method got hidden in child
        System.out.println("Child fraud check");
    }

    @Override
    public void doPostPaymentCheck() { // overridden :- instance method got overridden in child
        System.out.println("Child do post payment check");
    }

}

class UpiPayment extends Payment {
    long receiverMobileNumber;

    public void sendConfirmationMessage() {
        System.out.println("Get the confirmation message");
    }
}

class Father {
    public Father (){
        System.out.println("Inside father constructor");
    }
}

class Child extends Father {

     final String name = "Chinmaya";

    public Child (){
        super();
        System.out.println("Inside child constructor");
    }
}

class ChildSon extends Child {

     final String name = "Something";

    public ChildSon() {
        super();
        System.out.println("Inside child son constructor");
        System.out.println("this is called instance variable shadowing -> " + name);
        System.out.println("to get the parent variable details we have to use super -> " + super.name);
    }
}

// java supports single inheritance, hierarchical inheritance, multilevel inheritance not multiple inheritance
//through inheritance

// constructor chaining