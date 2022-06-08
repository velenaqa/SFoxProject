package pages;

public class StringIsPalindrome {


    public static boolean isPalindrome(String s) {
        int n = s.length(); // сalculate the length of a string
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1))  // check the inequality of characters in the appropriate order
            {
                return false;
            }
        }
        return true;
    }


}
