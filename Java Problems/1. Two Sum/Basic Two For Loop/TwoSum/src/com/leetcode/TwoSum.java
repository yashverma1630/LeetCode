package com.leetcode;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int n = scn.nextInt();
        int[] nums = new int[n];

        System.out.print("Enter numbers in array : ");
        for(int i = 0; i<n; i++){
            nums[i]=scn.nextInt();
        }

        System.out.print("Enter target value : ");
        int target = scn.nextInt();

        int arr[] = twoSum(nums, target);

        System.out.println("Two Sum indexes : "+Arrays.toString(arr));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0 ; i < nums.length; i++){
            for (int j = 0; j<nums.length; j++){
                if(i == j){
                    continue;
                }
                else if(nums[i]+nums[j]==target){
                    arr[0]=j;
                    arr[1]=i;
                    break;
                }
            }
        }

        return (arr);

    }
}
