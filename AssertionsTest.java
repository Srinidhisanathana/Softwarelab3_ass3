package qno_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsTest {

    @Test
    @DisplayName(" Assertion ArrayEquals")
    void initializeArray() {
        Assertions arr = new Assertions();
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1},arr.initializeArray(6));
    }

    @Test
    @DisplayName(" Assertion False and True")
    void isPalindrome() {
        Assertions s = new Assertions();
        assertFalse(s.isPalindrome("hello"));
        assertTrue(s.isPalindrome("amma"));
    }
}