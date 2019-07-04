import org.junit.Assert;
import org.junit.Test;

public class EvenFibonacciNumbersTest {

    @Test
    public void shouldReturn9() {
        //given
        EvenFibonacciNumbers evenFibonacciNumbers = new EvenFibonacciNumbers();
        //when
        long result = evenFibonacciNumbers.calculateNumbers(10);
        //then
        Assert.assertEquals(result, 9);
    }

    @Test
    public void shouldReturn187() {
        //given
        EvenFibonacciNumbers evenFibonacciNumbers = new EvenFibonacciNumbers();
        //when
        long result = evenFibonacciNumbers.calculateNumbers(100);
        //then
        Assert.assertEquals(result, 187);
    }

    @Test
    public void shouldReturn4613731() {
        //given
        EvenFibonacciNumbers evenFibonacciNumbers = new EvenFibonacciNumbers();
        //when
        long result = evenFibonacciNumbers.calculateNumbers(4_000_000);
        //then
        Assert.assertEquals(result, 4_613_731);
    }

}