import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int factorial(int n) {
        //only special case for factorials
        if(n == 1){
            return 1;
        }
        // perform factorial operation. i.e: 3 - 1 * 3 = 6
        return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);

        //print result
        System.out.println(result);
    }
}
