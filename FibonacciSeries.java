// Java program to print Fibonacci series using method
import java.util.Scanner;
public class FibonacciSeries {
    public static void fib(int n){
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
        sc.close();
    }
}
