public class Palindrome {

    public static void main(String[] args) {

        String wordToSearch = "abnonba";

        System.out.println(wordToSearch + " is a palindrome: " + isPalindromeIterative(wordToSearch) + ".");
        System.out.println(wordToSearch + " is a palindrome: " + isPalindromeRecursive(wordToSearch) + ".");
    }

    /* PALINDROME (iterative) */
    public static boolean isPalindromeIterative(String word) {
        int finalChar = word.length() - 1;

        if (word.length() == 1) {
            return true;
        }
        for (int i = 0; i < Math.floor(word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(finalChar - i)) {
                return false;
            }
        }
        return true;
    }


    /* PALINDROME (recursive) */
    public static boolean isPalindromeRecursive(String word) {
        int beg = 0;
        int end = word.length() - 1;

        if (word.length() <= 1) {
            return true;
        }
        if (word.charAt(beg) != word.charAt(end)) {
            return false;
        }

        String subs = word.substring(beg + 1, end);
        return isPalindromeRecursive(subs);
    }
}