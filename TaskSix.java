public class TaskSix {

    public static void main(String[] args) {
        int count = 10;
        System.out.println("Generating the first " + count + " Fibonacci numbers using recursion...");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }

        System.out.println();

    }

    public static int fibonacciRecursive(int n){
        if (n == 0) return 1;
        return n*fibonacciRecursive(n-1);

    }
}
