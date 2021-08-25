package Arrays;

import java.util.Scanner;

public class App13_MajorityElement {

    static int majorityElement(int[] ar){
        int cnt = 0;
        int ele = 0;

        for(int i : ar){
            if(cnt == 0){
                ele = i;
            }


            if(i == ele){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return ele;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i <s ; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println(majorityElement(ar));
    }
}
