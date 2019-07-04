public class EvenFibonacciNumbers {

    public long calculateNumbers(int sequenceNr) {
        long value1 = 1;
        long value2 = 2;
        long sum = 0;
        int i = 0;

        while (i < sequenceNr) {

            if (value1 % 2 == 0) {
                sum += value1;
            }

            System.out.println(value1);
            value1 += value2;
            i++;

            if (i < sequenceNr) {
                if (value2 % 2 == 0) {
                    sum += value2;
                }
                System.out.println(value2);
                value2 += value1;
                i++;
            }
        }

        return sum;

    }

}