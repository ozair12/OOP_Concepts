package JUnit_Intelli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add(){
var cal = new Calculator();
assertEquals(8,cal.add(5,3));

    }
}