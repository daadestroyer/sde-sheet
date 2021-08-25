package Arrays;

import java.util.Scanner;

public class App03_MergeTwoSortedArray_LEETCODE {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(nums2[j] > nums1[i]){
                System.out.println("hello");
                nums1[k] = nums2[j];
                k--;
                j--;
            }
            else{
                System.out.println("by");
                nums1[k] = nums1[i];
                k--;
                i--;
            }
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] ar1 = new int[m];
        int[] ar2 = new int[n];
        for(int i=0 ; i<m ; i++){
            ar1[i] = sc.nextInt();
        }
        for(int j=0 ; j<n ; j++){
            ar2[j] = sc.nextInt();
        }
        merge(ar1,m,ar2,n);
    }
}

/*
3 3

*/