public class TaskTen {

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println("Printing a descending star pattern with nested Recursive...");

        printPatternRecursive(numRows, numRows);

    }

    public static void printPatternRecursive(int rows, int cols){

        if (rows==0) return ;

        if (cols > 0) {
            System.out.print("* ");
            printPatternRecursive(rows, cols - 1);
        } else {
            System.out.println();
            printPatternRecursive(rows - 1, rows - 1);
        }
    }
}
