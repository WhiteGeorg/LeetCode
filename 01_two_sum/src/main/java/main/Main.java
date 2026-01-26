package main;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        int [] arr = new int[] {5 ,2 ,3 ,4 ,1};
        int num = 5;
        int [] resultArray = twoSum(arr,num);
        for(int i : resultArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[] { map.get(target - nums[i]), i };
            else
                map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}