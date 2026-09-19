package java_practice.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidationTest {

    @Test
    void map2CombinesValidValues() {
        Validation<String, Integer> result = Validation.map2(
                Validation.valid(2),
                Validation.valid(3),
                Integer::sum);

        assertEquals(Validation.valid(5), result);
    }

    @Test
    void map2AccumulatesErrorsFromBothInputs() {
        Validation<String, Integer> result = Validation.map2(
                Validation.invalid("first error"),
                Validation.invalid("second error"),
                Integer::sum);

        assertEquals(
                Validation.invalid(List.of("first error", "second error")),
                result);
    }

    @Test
    void registrationReportsEveryIndependentError() {
        Validation<String, ValidationExample.Registration> result =
                ValidationExample.validate("", 15);

        List<String> errors = result.fold(value -> value, ignored -> List.of());
        assertEquals(
                List.of("Username is required", "Age must be at least 18"),
                errors);
    }
}
