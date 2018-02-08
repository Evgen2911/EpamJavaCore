//public class Day26 {
import java.io.*;
import java.util.*;
//import java.date.*;


public class Solution {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        int day = jin.nextInt();
        int month = jin.nextInt();
        int year = jin.nextInt();
        int expDay = jin.nextInt();
        int expMonth = jin.nextInt();
        int yearExpected = jin.nextInt();

        int monthsLate = month - expMonth;
        int daysLate = day - expDay;
        int diff = ((year * 10000)+(month * 100)+ day)-((yearExpected * 10000)+ (expMonth * 100)+expDay);

        System.out.println((diff <= 0)? 0:(year - yearExpected > 0) ? 10000
                : (monthsLate > 0) ? monthsLate * 500
                :  daysLate * 15
        );
    }
}
}
