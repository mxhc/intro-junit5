package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    
    Greeting greeting;
    
    @BeforeAll
    public static void beforeClass() {
        System.out.println("I'm only called once");
    }
    
    @BeforeEach
    void setUp() {
        System.out.println("Before each");
        greeting = new Greeting();
    }
    
    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }
    
    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Milojko"));
    }
    
    @Test
    void testHelloWorld2() {
        System.out.println(greeting.helloWorld("Mika"));
    }
    
    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }
    
    @AfterAll
    public static void afterClass() {
        System.out.println("I'm only called once");
    }
}