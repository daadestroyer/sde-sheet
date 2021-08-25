package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main (String[] args) throws java.lang.Exception{
		/*
		5
        140 82
        89 134
        90 110
        112 106
        88 90

        1 58
		*/

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lead = 0;
        int player = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        while(n-->0){
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();

            lead = Math.abs(score1-score2);
            if(score1 > score2){
                player = 1;
            }
            else{
                player = 2;
            }

                hm.put(lead,player);


        }
        int winning_player = 0;
        int winning_lead = 0;

        for(Map.Entry<Integer,Integer> ans : hm.entrySet()){
            if(ans.getKey() > winning_lead){
                winning_lead = ans.getKey();
                winning_player = ans.getValue();
            }
        }
        System.out.println(winning_player+" "+winning_lead);
    }
}
