public class Calculater {
    public static void main(String[] args) {

        // do sum of two numbers
        int num1 = 10;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);

        result = sum(10, 5);
        System.out.println(result);
    }

    //write the sum function
    public static int sum(int a, int b) {
        return a + b;
    }
}
