package Arrays;

import java.util.Scanner;

/*
3
1 2 3
4 5 6
7 8 9

1 4 7
2 5 8
3 6 9

7 4 1
8 5 2
9 6 3


*/
public class App07_rotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[][] arr = new int[s][s];
        for (int i = 0; i < s ; i++) {
            for (int j = 0; j < s ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0 ; i<s ; i++){
            for (int j = i; j <s ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0 ; i<s ; i++){
            for(int j=0 ; j<arr.length/2 ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;
            }
        }

        for(int i=0 ; i<s ; i++){
            for(int j=0 ; j<s ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
