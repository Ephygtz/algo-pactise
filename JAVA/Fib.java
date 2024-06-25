import java.util.HashMap;
import java.util.Map;

public class Fib{
    private static Map<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
    //    int fibonaciIs = fibonacci(4);
       System.out.println("Fibonaci sequence is : " + fibonacci(30));
       System.out.println("Fib sequence is : " + fib(30));
    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static int fib(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                "Index was negative. No such thing as a negative index in a series.");

        // base cases
        } else if (n == 0 || n == 1) {
            return n;
        }

        // see if we've already calculated this
        if (memo.containsKey(n)) {
            System.out.printf("grabbing memo[%d]\n", n);
            return memo.get(n);
        }

        System.out.printf("computing fib(%d)\n", n);
        int result = fib(n - 1) + fib(n - 2);

        // memoize
        memo.put(n, result);

        return result;
    }
}