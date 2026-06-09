import java.util.*;
interface Vehicle {

    void start();

}

class Car implements Vehicle {

    @Override
    public void start() {

        System.out.println("Car Started");

    }

}

class Bike implements Vehicle {

    @Override
    public void start() {

        System.out.println("Bike Started");

    }

}

public class Main {

    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();

    }
}