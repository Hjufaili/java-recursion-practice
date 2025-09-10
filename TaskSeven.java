public class TaskSeven {
    public static void main(String[] args) {
        String sentence = "recursion is replacing the repetition of Recursive";
        char target = 'r';
        System.out.println("Counting occurrences of '" + target + "' with a Recursive...");

        int result= countCharRecursive(sentence, target, 0);

        System.out.println("The character '" + target + "' appears " + result + " times.");

    }

    public static int countCharRecursive(String text, char target, int index){

        if (index>=text.length()) return 0;
        if (text.charAt(0)==target) return 1 + countCharRecursive(text,target, index+1);
        return countCharRecursive(text,target, index+1);
    }


}

