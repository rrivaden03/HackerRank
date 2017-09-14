import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        for(int i = 0; i < N; i++){
            String S = in.nextLine();
            char charArray[] = S.toCharArray();

            // for even-indexed characters
            for(int j = 0; j < charArray.length; j++){
                if(j % 2 == 0){
                    System.out.print(charArray[j]);
                }
            }

            // denote space for the rest of chars
            System.out.print(" ");

            // for odd-indexed characters
            for(int j = 0; j < charArray.length; j++){
                if(j % 2 == 1){
                    System.out.print(charArray[j]);

                }
            }
            // finally - print next line
            System.out.println();
        }
    }
}
