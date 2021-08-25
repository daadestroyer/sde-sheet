package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App14_MajorityElement_2 {

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int num1 = 0 , num2 = 0 , cnt1 = 0 , cnt2 = 0 , n = nums.length;

        for(int i=0 ; i<n ; i++){
            if(num1 == nums[i])
                cnt1++;
            else if(num2 == nums[i])
                cnt2++;
            else if(cnt1 == 0) {
                num1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0){
                num2 = nums[i];
                cnt2 = 1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;

        for(int i : nums){
            if(i == num1){
                cnt1++;
            }
            else if(i == num2){
                cnt2++;
            }
        }
        if(cnt1 > n/3){
            res.add(num1);
        }
        if(cnt2 > n/3){
            res.add(num2);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for(int i=0 ; i<s ; i++){
            ar[i] = sc.nextInt();
        }
        List<Integer> integers = majorityElement(ar);
        System.out.println(integers);
    }
}
