import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        // loop that deals with reverse order
        for(int i = 0; i < n; i++){
            int rev_index = n - i - 1;
            System.out.print(arr[rev_index] + " ");
        }
        in.close();
    }
}
