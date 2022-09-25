package q_no_4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionsTest {

    @Test
    @DisplayName("Test Null Pointer Exception")
    void stringLength() {
        Exceptions test = new Exceptions();
        assertThrows(NullPointerException.class,() -> test.stringLength());
    }

    @Test
    @DisplayName("Test Arithmetic Exception")
    void division() {
        Exceptions test = new Exceptions();
        assertThrows(ArithmeticException.class,() -> test.division());
    }
}