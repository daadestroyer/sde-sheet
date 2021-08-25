package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class App01_SortColors{

    static void sortColors(int[] ar,int n){
        // 2,0,2,1,1,0
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(ar[mid] == 2){
                // swap it with high
                int temp = ar[high];
                ar[high] = ar[mid];
                ar[mid] = temp;
                high--;
            }
            else if(ar[mid] == 0){
                int temp = ar[low];
                ar[low] = ar[mid];
                ar[mid] = temp;
                low++;
                mid++;
            }
            else{
                // if arr[mid] == 1 then increase mid
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i <s ; i++) {
            ar[i] = sc.nextInt();
        }

        sortColors(ar,ar.length);
        System.out.println(Arrays.toString(ar));
    }
}
