import java.util.ArrayList;
import java.util.Comparator;

public class LC9PalindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }
            String palindrome = String.valueOf(x);
            int j = palindrome.length()-1;
            for (int i = 0; i < palindrome.length(); i++) {
                char a = palindrome.charAt(i);
                char b = palindrome.charAt(j);
                if ( a!=b
                ) {
                    return false;
                }
                j--;
            }
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
