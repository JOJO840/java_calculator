package java_calculator;
   
import org.junit.Test;
import static org.junit.Assert.*;
   
public class RepParseTest {
        
        @Test
        public void testParser() {
                Representation actual = RepresentationParser.parse("1", "+", "1");
                Representation expected =  new Representation(1.0, 1.0, '+');
                assertEquals(expected, actual);
        }
  
}

