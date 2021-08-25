package Arrays;

import java.util.Scanner;

public class App15_SearchIn2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;

        while(i< matrix.length && j>=0){
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] ar = new int[r][c];

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(searchMatrix(ar,target));
    }

}
/*
3 4
1 3 5 7
10 11 16 20
23 30 34 60
3
*/
