//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // "Put" contacts into phone book
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String name = in.next();

            if(phoneBook.containsKey(name)){
                int phone = phoneBook.get(name);
                // print result in format: "name=phone"
                System.out.println(name + "=" + phone);
            }
            // if there is not a contact in phone book, print Not found
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
