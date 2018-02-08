//public class Day6 {
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String even = "", odd = "";
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String s;
        for(int i=0; i < T ; i++){
            s = scan.next();
            for (int j = 0; j < s.length(); j++){
                if(j % 2 == 0) even += s.charAt(j);
                else odd += s.charAt(j);
            }
            System.out.println(even + " " + odd);
            even = "";
            odd = "";
        }


    }
}
}
