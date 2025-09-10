public class TaskTwo {

    public static void main(String[] args) {
        String original = "Hello World";
        System.out.println("Reversing string using a Recursive...");

        String reversed = reverseStringRecursive(original,original.length()-1);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }


public static String reverseStringRecursive(String str,int index) {
        if (index<0) return "";

        return str.charAt(str.length()-1) + reverseStringRecursive (str.substring(0,str.length()-1),index-1) ;
}
}
