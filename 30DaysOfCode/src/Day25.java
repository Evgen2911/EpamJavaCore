//public class Day25 {
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int j = 0; j < n; j++){
            int val = scan.nextInt();
            boolean b = true;
            if (val == 1 || val % Math.sqrt(val) == Math.sqrt(val)) b = false;
            else{
                for (int i = 2; i <= val/i; i++){
                    if (val % i == 0){
                        b = false;
                        break;
                    }
                }
            }
            if (b == false) System.out.println("Not prime");
            else System.out.println("Prime");
        }

    }
}
}
