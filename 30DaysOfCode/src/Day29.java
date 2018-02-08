//public class Day29 {
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int m = in.nextInt();
            if (((m - 1) | m) > n && m % 2 == 0) System.out.println(m-2);
            else System.out.println(m-1);
        }
    }
}
}
