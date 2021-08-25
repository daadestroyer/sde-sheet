package Arrays;

import java.util.Scanner;

public class App06_FindTheDuplicateNumber {

    static int findTheDuplicateNumber(int[] ar){
        int slow = ar[0];
        int fast = ar[0];

        do{
            slow = ar[slow];
            fast = ar[ar[fast]];
        }while(slow != fast);

        fast = ar[0];

        while(slow != fast){
            slow = ar[slow];
            fast = ar[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = sc.nextInt();
        }
        int theDuplicateNumber = findTheDuplicateNumber(ar);
        System.out.println(theDuplicateNumber);
    }
}
