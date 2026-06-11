import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional<String> name =
                Optional.empty();

        System.out.println(
                name.orElse("No Name Found")
        );

    }
}