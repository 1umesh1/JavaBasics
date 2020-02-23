/* Fibonacci series to display n series*/


public class fibonacci {
    public static void main(String[] args) {

        int n=2;
        for (int i=0;i<=n-1;i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }

    public static int fibonacci(int n) {
        if (n <=1) {
            return n;
        }

            return fibonacci(n - 1) + fibonacci(n - 2);
        }



}