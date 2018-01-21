
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String wordOne = "rita";
        String wordTwo = "aitr";

        System.out.println(wordOne + " and " + wordTwo + " are anagrams: " + isAnagram(wordOne, wordTwo));
    }

    /* ANAGRAM */

    public static boolean isAnagram(String strOne, String strTwo) {
        strOne = sortString(strOne);
        strTwo = sortString(strTwo);

        if (strOne.length() != strTwo.length()) {
            return false;
        }

        if (!strOne.contains(strTwo)) {
            return false;
        }
        return true;
    }

    private static String sortString(String strToSort) {
        char[] charArray = strToSort.toCharArray();
        Arrays.sort(charArray);
        return new String (charArray);
    }
}
