package palindrome;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static pages.StringIsPalindrome.isPalindrome;

public class PalindromeTest {

    String s;

    /**
     * Check string is Palindrome
     */

    @Test
    public void stringIsPalindromeTest() {
        s = "1234554321";
        isPalindrome(s);
        assertTrue(isPalindrome(s));

    }

    /**
     * Check string is not Palindrome
     */

    @Test
    public void stringIsNotPalindromeTest() {
        s = "5645371212";
        isPalindrome(s);
        assertFalse(isPalindrome(s));

    }

}

