//public class Day28 {
import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String mailRegEx = ".+@gmail\\.com$";
        Pattern pat = Pattern.compile(mailRegEx);
        List<String> list = new ArrayList();
        for (int i = 0; i < num; i++){
            String name  =in.next();
            String mail = in.next();
            Matcher mat = pat.matcher(mail);
            if (mat.find()) list.add(name);
        }
        Collections.sort(list);
        for (String name : list) System.out.println(name);
    }
}
}
