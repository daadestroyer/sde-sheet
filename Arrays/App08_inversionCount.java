package Arrays;

import java.util.Scanner;

public class App08_inversionCount {
    static int count = 0;

    static int[] mergeTwoSortedArray(int[] left , int[] right){
        int[] res = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]) {
                res[k] = left[i];
                i++;
                k++;
            }
            else{
                count += (left.length - i);
                res[k] = right[j];
                k++;
                j++;
            }
        }

        while(i < left.length){
            res[k++] = left[i++];
        }

        while(j < right.length){
            res[k++] = right[j++];
        }
        return res;
    }
    static int[] divideArray(int[] ar , int low , int high){
        if(low == high){
            int[] base = new int[1];
            base[0] = ar[low];
            return base;
        }

        int mid = (low+high)/2;

        int[] left = divideArray(ar,low,mid);
        int[] right = divideArray(ar,mid+1,high);

        int[] result = mergeTwoSortedArray(left,right);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for(int i=0 ; i<s ; i++) {
            ar[i] = sc.nextInt();
        }

        divideArray(ar , 0 , ar.length-1);
        System.out.println(count);
    }
}
