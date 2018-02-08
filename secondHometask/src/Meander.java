import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Meander {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input size of square matrix");
        int m = Integer.parseInt(br.readLine());
        /*System.out.println("Input number of columns");
        int n = Integer.parseInt(br.readLine());*/

        //int[] s = new int[m*n];
        int[][] matrix = new int[m][m];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                System.out.println("Input element of matrix[" + i + "][" + j + "]");
                matrix[i][j] = Integer.parseInt(br.readLine());
            }
        }
        getMeander(matrix, m);
    }


    private static void getMeander(int[][] matrix, int m){
        int border = m;
        int i, k;
        for (k = 1; k < border; k++) {
            for (i = k - 1; i < border - k +1; i++)
                System.out.print(matrix[k - 1][i] + " ");

            for (i = k; i < border - k +1; i++)
                System.out.print(matrix[i][border - k] + " ");

            for (i = border - k - 1; i >= k - 1; --i)
                System.out.print(matrix[border - k][i] + " ");

            for (i = border - k - 1; i >= k; i--)
                System.out.print(matrix[i][k - 1] + " ");
        }

    }
}
