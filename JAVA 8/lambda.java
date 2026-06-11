@FunctionalInterface
interface Multiply {

    int multiply(int a, int b);

}

public class Main {

    public static void main(String[] args) {

        Multiply m = (a, b) -> a * b;

        System.out.println(
                m.multiply(10, 20)
        );

    }
}