public class fibonacci {
    public static int Fibonacci(int n) {
        if (n <= 1) return n;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int count = 10;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }
}
