
    public class TaskFive {

    public static void main(String[] args) {

        int base = 3;
        int exponent = 4;
        System.out.println("Calculating " + base + "^" + exponent + " using a Recursive...");
        long result = powerRecursive(base,exponent);

        System.out.println("Result: " + result); // Expected: 81


    }

    public static long powerRecursive(int base, int exp){

        if (exp==0) return 1;

        return base * powerRecursive(base,exp-1);
    }
}
