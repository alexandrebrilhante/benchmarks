class Fibonacci {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(fibonacci(25));
        System.out.println(System.nanoTime() - start);
    }
    
    public static int fibonacci(final int n) {
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
