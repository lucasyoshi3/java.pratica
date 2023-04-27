package LeetCode;
import java.util.*;
public class SearchInsertPosition {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length:");
        int arraylength = sc.nextInt();
        int[] nums = new int[arraylength];
        System.out.println("Target:");
        int target = sc.nextInt();
        System.out.println("Nums:");
        for (int i = 0; i <= arraylength - 1; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert ( int[] nums, int target){
        int i;
        if (target < nums[0]) return 0;
        for (i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == target) return i;
        }
        for (i = 1; i <= nums.length - 1; i++) {
            if (nums[i - 1] < target & nums[i] > target) return i;
            if (nums[i] < target & i == nums.length - 1) return i + 1;
        }
        return i;
    }
}
