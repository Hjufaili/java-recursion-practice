public class TaskEight {

    public static void main(String[] args) {
        int number = 12345;

        System.out.println("Calculating the sum of digits for " + number + " with a Recursive...");
        int sum= sumDigitsRecursive(number);

        System.out.println("The sum of the digits is: " + sum);



    }

    public static int sumDigitsRecursive(int number){

        if (number==0) return 0;

        int digit= number%10;

        return digit + sumDigitsRecursive(number/10);
    }
}
