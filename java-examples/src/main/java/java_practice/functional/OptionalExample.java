package java_practice.functional;

import java.util.Optional;

public class OptionalExample {

    Optional<String> emptyStringOpt = Optional.empty();

    String name = "John";
    Optional<String> johnOpt = Optional.of(name);

    String nullableName = null;
    Optional<String> nullableNameOpt = Optional.ofNullable(nullableName); // This will create an empty optional.

    void optionalLogic() {

        String name = "John";
        Optional<String> johnOpt = Optional.of(name);

        if (johnOpt.isPresent()) {
            System.out.println("Name is present");
        } else {
            System.out.println("Name is NOT present");
        }
        ;

        johnOpt.ifPresent(johnsName -> System.out.println("Hello, " + johnsName));
    };

    int returnAValueFromOptionalLogic() {

        String name = "John";
        Optional<String> johnOpt = Optional.of(name);

        if (johnOpt.isPresent()) {
            return 5;
        } else {
            return 10;
        }
    };

    int returnAValueFromOptionalImproved() {

        // more functional approach

        String name = "John";
        Optional<String> johnOpt = Optional.of(name);

        return johnOpt.map(johnsName -> 5).orElse(10);
    };


    Optional<Integer> flatMapExmaple() {

        String name = "John";
        Optional<String> johnOpt = Optional.of(name);
        Optional<Integer> newOpt = johnOpt.flatMap(s -> Optional.of(s.length()));

        return newOpt;
    };

}
