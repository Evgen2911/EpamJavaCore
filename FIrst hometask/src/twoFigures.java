import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twoFigures {
    public static void main(String[] args) throws IOException {
        int x1f1, x2f1, y1f1, y2f1, x1f2, x2f2, y1f2, y2f2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input X1 for figure 1");
        x1f1 = Integer.parseInt(br.readLine());

        System.out.println("Input Y1 for figure 1");
        y1f1 = Integer.parseInt(br.readLine());

        System.out.println("Input X2 for figure 1");
        x2f1 = Integer.parseInt(br.readLine());

        System.out.println("Input Y2 for figure 1");
        y2f1 = Integer.parseInt(br.readLine());

        System.out.println("Input X1 for figure 2");
        x1f2 = Integer.parseInt(br.readLine());

        System.out.println("Input Y1 for figure 2");
        y1f2 = Integer.parseInt(br.readLine());

        System.out.println("Input X2 for figure 2");
        x2f2 = Integer.parseInt(br.readLine());

        System.out.println("Input Y2 for figure 2");
        y2f2 = Integer.parseInt(br.readLine());

        System.out.println(oneFigure.getSquare(getCrossFigure(x1f1, y1f1, x2f1, y2f1, x1f2, y1f2, x2f2, y2f2)));
    }

    private static int[] getCrossFigure(int x1f1, int y1f1, int x2f1, int y2f1, int x1f2, int y1f2, int x2f2, int y2f2){
        int[] a = new int[4];
        if ((x1f1 >= x1f2 && x1f2 >= x2f1)||(x1f1 >= x1f2 && x1f2 >= x2f1)) a[0] = x1f2;
        else if ((x1f1 >= x2f2 && x2f2 >= x2f1)||(x1f1 >= x2f2 && x2f2 >= x2f1)) a[0] = x2f2;
        if ((y1f1 >= y2f2 && y2f2 >= y2f1)||(y1f1 >= y2f2 && y2f2 >= y2f1)) a[1] = y2f2;
        else if ((y1f1 >= y1f2 && y1f2 >= y2f1)||(y1f1 >= y1f2 && y1f2 >= y2f1)) a[1] = y1f2;
        if ((x1f2 >= x1f1 && x1f1 >= x2f2)||(x1f2 >= x1f1 && x1f1 >= x2f2)) a[2] = x1f1;
        else if ((x1f2 >= x2f1 && x2f1 >= x2f2)||(x1f2 >= x2f1 && x2f1 >= x2f2)) a[2] = x2f1;
        if ((y1f2 >= y2f1 && y2f1 >= y2f2)||(y1f2 >= y2f1 && y2f1 >= y2f2)) a[3] = y2f1;
        else if ((y1f2 >= y1f1 && y1f1 >= y2f2)||(y1f2 >= y1f1 && y1f1 >= y2f2)) a[3] = y1f1;
        return a;
    }
}
