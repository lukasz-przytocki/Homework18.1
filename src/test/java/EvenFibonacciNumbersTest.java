import org.junit.Assert;
import org.junit.Test;

public class EvenFibonacciNumbersTest {

    @Test
    public void shouldReturn10for5() {
        //given
        EvenFibonacciNumbers evenFibonacciNumbers = new EvenFibonacciNumbers();
        //when
        long result = evenFibonacciNumbers.calculateNumbers(5);
        //then
        Assert.assertEquals(result, 10);
    }

    @Test
    public void shouldReturn10for7() {
        //given
        EvenFibonacciNumbers evenFibonacciNumbers = new EvenFibonacciNumbers();
        //when
        long result = evenFibonacciNumbers.calculateNumbers(7);
        //then
        Assert.assertEquals(result, 10);
    }

    @Test
    public void shouldReturn44for10() {
        //given
        EvenFibonacciNumbers evenFibonacciNumbers = new EvenFibonacciNumbers();
        //when
        long result = evenFibonacciNumbers.calculateNumbers(10);
        //then
        Assert.assertEquals(result, 44);
    }


}