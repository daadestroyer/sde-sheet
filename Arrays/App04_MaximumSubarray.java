package Arrays;

import java.util.Scanner;

public class App04_MaximumSubarray {

    static int maximumSubArray(int[] ar){
        // -2,1,-3,4,-1,2,1,-5,4
        int csum = ar[0];
        int osum = ar[0];

        for(int i : ar){
            if(csum > 0){
                csum += i;
            }
            else{
                csum = i;
            }
            if(csum > osum){
                osum = csum;
            }
        }
        return osum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for(int i=0 ; i<s ; i++){
            ar[i] = sc.nextInt();
        }
        int i = maximumSubArray(ar);
        System.out.println(i);

    }
}
/*
9
-2 1 -3 4 -1 2 1 -5 4
*/