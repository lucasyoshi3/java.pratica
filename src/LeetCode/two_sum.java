/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order. */

package LeetCode;
import java.util.*;
public class two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length:");
        int lengthArray = sc.nextInt();
        int[] nums = new int[lengthArray];
        for(int i=0;i<=lengthArray-1;i++){
            System.out.println("Nums:");
            nums[i]= sc.nextInt();
        }
        System.out.println("Target");
        int target = sc.nextInt();
        int[] two=twoSum(nums,target);
        for(int i=0;i<=two.length-1;i++){
            System.out.println(two[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int i,j;
        int legtharray=nums.length;
        int [] array=new int[2];
        legtharray=legtharray-1;
        for(i=0;i<=legtharray;i++){
            for(j=i+1;j<=legtharray;j++){
                if(nums[i]+nums[j]==target){
                    array[0]=i;
                    array[1]=j;
                    i=legtharray;
                    j=legtharray;
                }
            }
        }
        return array;
    }
}
