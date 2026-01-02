// Palindrome Number : the reverse of number should be same as original number
// 121 : true, -121 : false, 123 : false.
import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber =x;
        int revNumber = 0;
        while(x>0){
            revNumber = revNumber*10+x%10;
            x=x/10;
        }
        return originalNumber==revNumber;

    }
}