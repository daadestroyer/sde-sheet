package Arrays;

import java.util.Scanner;

public class App10_BestTimeToBuyAndSellStock {

    static int bestTimeToBuyAndSellStock(int[] stocks){
        // [7,1,5,3,6,4]

        int least_price = Integer.MAX_VALUE;
        int current_profit = 0;
        int final_profit = 0;

        for(int i : stocks){
            if(i < least_price){
                least_price = i;
            }
            current_profit = i - least_price;

            if(current_profit > final_profit){
                final_profit = current_profit;
            }
        }
        return final_profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for(int i=0 ; i<s ; i++){
            ar[i] = sc.nextInt();
        }
        System.out.println(bestTimeToBuyAndSellStock(ar));

    }
}
