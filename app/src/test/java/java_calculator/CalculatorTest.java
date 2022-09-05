package java_calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import java_calculator.Representation;

public class CalculatorTest {
        
        
        
        @Test
        public void test1plus1() {
                Representation rep = new Representation(1.0, 1.0, '+');
                double calc = Calculator.calculate(rep);
                assertEquals(2.0, calc, 0.0);

            }

        @Test
        public void test4div4() {
                Representation rep = new Representation(4.0, 4.0, '/');
                double calc = Calculator.calculate(rep);
                assertEquals(1.0, calc, 0.0);
        }


        @Test
        public void test5min4() {
                Representation rep = new Representation(5.0, 4.0, '-');
                double calc = Calculator.calculate(rep);
                assertEquals(1.0, calc, 0.0);
        }

        @Test
        public void test5multi9() {
                Representation rep = new Representation(5.0, 9.0, '*');
                double calc = Calculator.calculate(rep);
                assertEquals(45.0, calc, 0.0);

        }




                
}
