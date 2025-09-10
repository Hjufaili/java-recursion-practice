public class TaskThree {

    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 6, 23, 45, 34};
        System.out.println("Finding the maximum number with a Recursive...");
        int max= findMaxRecursive(numbers,0);
        System.out.println("The maximum number is: " + max);


    }

    public static int findMaxRecursive (int[] nums, int index){

        if (index>=nums.length) return 0;

        int maxInRest = findMaxRecursive(nums, index + 1);
        return Math.max(nums[index], maxInRest);


    }
}
