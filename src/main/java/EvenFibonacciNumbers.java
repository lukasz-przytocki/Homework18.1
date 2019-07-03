public class EvenFibonacciNumbers {

    public void calculateNumbers(){
        long value1=1;
        long value2=2;
        long sum=0;

        do {
            if(value1%2!=0){
                sum+=value1;

            }if(value2%2!=0){
                sum+=value2;
            }
            System.out.println(value1);
            System.out.println(value2);
            value1+=value2;
            value2+=value1;
        }
        while (value1<100 && value2<100);

        System.out.println("Suma: "+sum);

    }

}
