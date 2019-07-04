public class EvenFibonacciNumbers {

    public long calculateNumbers(long sequenceMax) {
        long value1 = 1;
        long value2 = 2;
        long sum = 0;

        do {
            if (value1 % 2 != 0) {
                sum += value1;

            }
            if (value2 % 2 != 0) {
                sum += value2;
            }

            value1 += value2;
            value2 += value1;
        }
        while (value1 < sequenceMax && value2 < sequenceMax);

        return sum;

    }

}