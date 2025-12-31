import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Hashmap for storing key and value.
        HashMap <Integer, Integer> map = new HashMap<>();

        // for loop to iterate through array.
        for(int i=0; i<nums.length; i++){
            int component = target - nums[i]; // gets the element to search for.

            if(map.containsKey(component)){
                // if we get the element just return the index from the array.
                return new int[] {map.get(component), i};
            }
            // just puts the key and value in the map.
            map.put(nums[i], i);
        }

        return new int[0];
    }
}