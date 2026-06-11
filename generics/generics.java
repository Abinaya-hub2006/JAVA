import java.util.*;

class Student<T> {

    T data;

    void setData(T data) {

        this.data = data;

    }

    T getData() {

        return data;

    }
}

public class Main {

    public static void main(String[] args) {

        Student<String> s = new Student<>();

        s.setData("Abinaya");

        System.out.println(s.getData());

    }
}