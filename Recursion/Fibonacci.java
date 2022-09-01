package Recursion;

public class Fibonacci {
    // Assuming n is a positive integer
    public static int fib(int n) {
        if (n >= 3) {
            return fib(n-1) + fib(n-2);
        }

        return 1;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            System.out.print(fib(i) + ",");
        }
    }
}
