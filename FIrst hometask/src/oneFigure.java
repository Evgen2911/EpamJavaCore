import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oneFigure {
    public static void main(String[] args) throws IOException {
        int[] a = new int[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input X1");
        a[0] = Integer.parseInt(br.readLine());

        System.out.println("Input Y1");
        a[1] = Integer.parseInt(br.readLine());

        System.out.println("Input X2");
        a[2] = Integer.parseInt(br.readLine());

        System.out.println("Input Y2");
        a[3] = Integer.parseInt(br.readLine());


        System.out.println(getSquare(a));
    }

    public static int getSquare(int[] a) {
        int square;

        square = Math.abs(a[0] - a[2]) * Math.abs(a[1] - a[3]);

        return square;
    }
}
