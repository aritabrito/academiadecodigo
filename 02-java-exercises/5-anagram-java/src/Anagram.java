
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String wordOne = "Rita";
        String wordTwo = "aitr";

        System.out.println(wordOne + " and " + wordTwo + " are anagrams: " + isAnagram(wordOne, wordTwo));
    }

    /* ANAGRAM */

    public static boolean isAnagram(String strOne, String strTwo) {
      strOne = strOne.toLowerCase();
      strTwo = strTwo.toLowerCase();
      
      strOne = sortString(strOne);
      strTwo = sortString(strTwo);
        
      if (strOne.length() != strTwo.length()) {
          return false;
      }
      if (!strOne.equals(strTwo)) {
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
