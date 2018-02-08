//public class Day1 {
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";

            Scanner scan = new Scanner(System.in);
            int m;
            double f;
            String str;/* Declare second integer, double, and String variables. */

            m = 3;/* Read and save an integer, double, and String to your variables.*/
            f = 2.8;
            str = "is my favorite platform!";// Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
            System.out.println(i + m); /* Print the sum of both integer variables on a new line. */

            System.out.println(d + f);/* Print the sum of the double variables on a new line. */

            System.out.println(s + str);/* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
            scan.close();
        }
    }

        }
