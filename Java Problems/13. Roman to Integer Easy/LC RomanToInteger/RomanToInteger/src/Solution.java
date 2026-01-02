import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap <Character, Integer> map = new HashMap <>(Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000)); // used hashmap for key value pairs.

        // All the Values of roman numbers are stored in HashMap

        int ans = 0; // ans (answer) variable is created.

        // For loop will iterate through the entered string s.
        for(int i=0; i<s.length(); i++){
            // if condition will check adjacent values
            // if 1st number is smaller than the 2nd number then it will subtract the 2nd number from 1st.
            // this if condition will only work until i reaches to second last index of the string.
            // and 1st number is smaller than the 2nd number.
            if(i<(s.length()-1) &&  map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                ans = ans+(map.get(s.charAt(i+1))-map.get(s.charAt(i)));
                i++; // this will skip the next number to check
            }
            // if above condition doesn't match then simply add number in the ans.
            else{
                ans+=map.get(s.charAt(i));
            }
        }

        return ans;
    }
}