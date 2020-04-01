package de.gbsschulen;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Unit test for simple App.
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testCountTo7() {
        String result = fizzBuzz.fizzBuzz(7);
        assertThat(result).isEqualTo("1, 2, Fizz, 4, Buzz, Fizz, 7");
    }

    @Test
    public void testCountTo15() {
        String result = fizzBuzz.fizzBuzz(15);
        assertThat(result).isEqualTo("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz");
    }

    @Test
    public void testCountTo35() {
        String result = fizzBuzz.fizzBuzz(35);
        assertThat(result).isEqualTo("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz");
    }

    @Test
    public void testCountTo0() {
        String result = fizzBuzz.fizzBuzz(0);
        assertThat(result).isEqualTo("");
    }

    @Test
    public void testCountTo20(){
        String result = fizzBuzz.fizzBuzz(20);
        assertThat(result).isEqualTo("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz");
    }

    @Test
    public void testCountTo30(){
        String result = fizzBuzz.fizzBuzz(30);
        assertThat(result).isEqualTo("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz");
    }
}
