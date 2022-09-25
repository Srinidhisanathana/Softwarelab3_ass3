package qno_6;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import static org.junit.jupiter.api.Assertions.*;

class RepeatingTest {

    @RepeatedTest(value = 10, name = "Test# {currentRepetition} Power X^N")
    void powerOf2(RepetitionInfo info) {
        Repeating test = new Repeating();

        int k = info.getCurrentRepetition();

        if(k%2==0) {
            assertEquals((int)Math.pow(2,k),test.power(2,k));
        }
        else {
            assertEquals((int)Math.pow(3,k),test.power(3,k));
        }
    }
}