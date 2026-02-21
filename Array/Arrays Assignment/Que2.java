 
/*  Question 2:There is an integer array nums sorted in ascending order (with distinct values). Prior to being
 passed to your function, nums is possibly rotated at an unknown pivot index k (1knums length) such that the resulting array 
 is [nums[k]. nums[k+11, numsin-1], nums[0], nums[1]... nums[k-1]] (0-indexed). For index 3 and example, [0,1,2,4,5,6,7] might become [4,5,6,7,0,1.2 be rotated at Divot
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums (4, 5, 6, 7, 0, 1, 2), target = 0
Output: 4
Example 2:
Input: nums=[4, 5, 6, 7, 0, 1, 2], target = 3   
Output: -1
Example 3:
Input: nums [1], target = 0
Output: -1

Constraints:

 ~ 1<= nums. lengtth <= 5000
~ -10 nurns [1]<=10
~ All values of nums are unique.
~ nums is an ascending array that is possibly rotated.
~ -10^4 <target <= 10^4  */
import java.util.*;

public class Que2 {

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            // Left half sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

       /*  int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; */
       /*  int[] nums = {4,5,6,7,0,1,2}; 
        int target = 3;  */
        int [] nums = {1};
        int target = 0;

        int result = search(nums, target);

        System.out.println("Index: " + result);
    }
}