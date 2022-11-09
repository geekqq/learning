package Day68;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonnaci2(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n < 2) return n;
        int a = 0;
        int b = 0;
        int next = 1;

        for (int i = 2; i <= n; i++) {
            a = b;
            b = next;
            next = a + b;
        }
        return next;
    }

    public static int fibonnaci2(int n) {
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}