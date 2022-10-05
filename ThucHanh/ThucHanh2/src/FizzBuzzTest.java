import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FizzBuzzTest {
    @Test

    void testFizz3(){
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizz6(){
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testBuzz5(){
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }

}
