public class PolymorphismOverriding {
    public static void main(String[] args) {
        IT it = new IT();
        it.getTotalLeave();
        IT instance = it.getInstance();
        instance.getTotalLeave();

    }
}


class IT {
    void getTotalLeave() {
        System.out.println("Total leaves are => " + 20);
    }

    IT getInstance() {
        return this;
    }
}

class Tavant extends IT {

    @Override
    Tavant getInstance() { // covariant return type
        return this;
    }

    @Override
    void getTotalLeave() {
        System.out.println("Total leaves are => " + 30);
    }

    int getTotalLeave(int days) {
        return 30;
    }
}