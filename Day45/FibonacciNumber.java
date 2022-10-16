package Day45;

public class FibonacciNumber {
    public static void main(String[] args) {
        //print fibonacci numbers
        for (int i = 0; i < 30; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < 30; i++) {
            System.out.print(fibonacci2(i) + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) { //TODO: long
        if (n < 2) {
            return n;
        }
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

    public static int fibonacci2(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci2(n - 1) + fibonacci2(n - 2);
    }
}
