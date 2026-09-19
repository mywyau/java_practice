package java_practice.functional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EitherTest {

    @Test
    void mapTransformsARightValue() {
        Either<String, Integer> result = Either.<String, Integer>right(4)
                .map(number -> number * 2);

        assertEquals(Either.right(8), result);
    }

    @Test
    void mapDoesNotTransformALeftValue() {
        Either<String, Integer> result = Either.<String, Integer>left("broken")
                .map(number -> number * 2);

        assertEquals(Either.left("broken"), result);
    }

    @Test
    void flatMapShortCircuitsAtTheFirstLeft() {
        Either<String, Integer> result = EitherExample.divideText("not-a-number", "0");

        assertEquals(Either.left("Not an integer: not-a-number"), result);
        assertFalse(result.isRight());
    }

    @Test
    void foldHandlesBothCases() {
        assertEquals("error: no", Either.<String, Integer>left("no")
                .fold(error -> "error: " + error, Object::toString));
        assertEquals("42", Either.<String, Integer>right(42)
                .fold(error -> "error: " + error, Object::toString));
        assertTrue(Either.right(42).isRight());
    }
}
