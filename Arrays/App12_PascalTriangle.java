package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App12_PascalTriangle {

    static List<List<Integer>> pascalTriangle(int numRows){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row , pre = null;

        for(int i=0 ; i< numRows;  ++i){
            row = new ArrayList<Integer>();
            for(int j=0 ; j<=i ; ++j){
                if(j==0 || j==i){
                    row.add(1);
                }
                else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre= row;
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> lists = pascalTriangle(n);
        System.out.println(lists);
    }
}
