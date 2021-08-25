package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class App11_NextPermutation {

    static void reverse(int[] nums , int idx1 , int idx2){
        swap(nums,idx1++,idx2--);
    }

    static void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        // 1 4 2 3 5 -->  1 3 5 4 2

        int i = nums.length-2;

        while(nums[i] > nums[i+1]){
            i--;
        }

        if(i>=0){
            int j = nums.length-1;
            while(nums[j] <= nums[i]){
                j--;
                swap(nums,i,j);
            }
        }
        reverse(nums,i+1,nums.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for(int i=0 ; i<s ; i++){
            ar[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(ar));
    }
}
