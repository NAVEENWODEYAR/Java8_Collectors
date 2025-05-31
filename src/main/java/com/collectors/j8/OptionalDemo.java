package com.collectors.j8;

import java.util.Optional;

/**
 * @author NaveenWodeyar
 *
 */

class User {
    private String name;
    public User(String name) { this.name = name; }
    public String getName() { return name; }
}

public class OptionalDemo {
    public static void main(String[] args) {

        // 1. Creating Optional objects
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();

        // 2. get(), isPresent()
        if (optional1.isPresent()) {
            System.out.println("optional1 contains: " + optional1.get());
        }

        // 3. orElse() and orElseGet()
        String value1 = optional2.orElse("Default Value");
        String value2 = optional2.orElseGet(() -> "Generated Default");
        System.out.println("optional2 orElse: " + value1);
        System.out.println("optional2 orElseGet: " + value2);

        // 4. orElseThrow()
        try {
            String value3 = optional3.orElseThrow(() -> new RuntimeException("Value is missing!"));
            System.out.println(value3);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // 5. ifPresent()
        optional1.ifPresent(val -> System.out.println("ifPresent: " + val));

        // 6. ifPresentOrElse()
        optional2.ifPresentOrElse(
            val -> System.out.println("Value: " + val),
            () -> System.out.println("Value is not present")
        );

        // 7. map() - transform value
        Optional<String> upper = optional1.map(String::toUpperCase);
        upper.ifPresent(val -> System.out.println("Mapped to uppercase: " + val));

        // 8. flatMap() - transforming and flattening
        Optional<Optional<String>> nested = optional1.map(val -> Optional.of("Nested: " + val));
        Optional<String> flat = optional1.flatMap(val -> Optional.of("Flat: " + val));
        nested.ifPresent(val -> System.out.println("Nested Optional: " + val.get()));
        flat.ifPresent(val -> System.out.println("Flat Optional: " + val));

        // 9. Using Optional with custom object
        Optional<User> userOpt = Optional.of(new User("Alice"));

        userOpt.map(User::getName)
               .ifPresent(name -> System.out.println("User name is: " + name));

        // 10. Safe method returning default when null
        String nameResult = getName(null);
        System.out.println("Result of getName(null): " + nameResult);
    }

    // Example method using Optional to return default name
    public static String getName(String name) {
        return Optional.ofNullable(name).orElse("Default Name");
    }
}
