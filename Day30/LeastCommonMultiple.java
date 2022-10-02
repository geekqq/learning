package Day30;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        System.out.println(lcm(5,10));
        System.out.println(lcm(8,10));
        System.out.println(zxgbs(6,10));
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return a % b == 0 ? b : gcd(b, a % b);
    }

    public static int zxgbs(int a, int b) {
        int max = Math.max(a, b);
        for (int i = max; ; i += max) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
    }
}
