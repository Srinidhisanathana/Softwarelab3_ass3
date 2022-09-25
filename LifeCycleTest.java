package qno_5;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class LifeCycleTest {
    LifeCycle test;

    /*@BeforeAll 
    static void setUpAll() {
        System.out.println("@ Before All");
    }*/

    @BeforeEach
    void setUp() {
        test = new LifeCycle();
        test.array=new int[]{5,4,3,9,6,2,1};
        test.n=16;
        System.out.println("@ Before Each");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("@ After All");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@ After Each");
    }
    @BeforeAll 
    static void setUpAll() {
        System.out.println("@ Before All");
    }

    @Test
    void arraySum() {
        System.out.println("Array sum method testing");
        assertEquals(30,test.arraySum());
    }

    @Test
    void isPrime() {
        System.out.println("Prime method testing");
        assertFalse(test.isPrime());
    }
}