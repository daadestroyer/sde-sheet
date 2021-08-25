package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class App02_RepeatAndMissingNumber {

    static int[] repeatAndMissingNumber(int[] ar){
        // 4, 3, 6, 2, 1, 1
        int R = 0;
        int M = 0;
        int[] count = new int[ar.length+1];

        for(int i=0 ; i<ar.length;i++){
            count[ar[i]]++;
        }
        for(int i=1 ; i<count.length ; i++){
            if(count[i] == 2) {
                M = i;
            }
            else if(count[i] == 0){
                R = i;
            }
        }
        return new int[] {M,R};

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = sc.nextInt();
        }

       int[] res = repeatAndMissingNumber(ar);
        System.out.println(Arrays.toString(res));
    }
}
