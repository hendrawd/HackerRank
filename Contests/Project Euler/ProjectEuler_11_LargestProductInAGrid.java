import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler011">https://www.hackerrank.com/contests/projecteuler/challenges/euler011</a>
 * @since 3/8/16
 */

public class ProjectEuler_11_LargestProductInAGrid {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new ProjectEuler_11_LargestProductInAGrid();
    }

    private void solve() throws IOException {
        short[][] grid = new short[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                grid[i][j] = nextShort();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int horizontalSum = 0;
                int verticalSum = 0;
                int diagonalSum = 0;
                int antiDiagonalSum = 0;
                if (j < 17)
                    horizontalSum = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
                if (i < 17)
                    verticalSum = grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
                if (i < 17 && j < 17)
                    diagonalSum = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
                if (i > 2 && j < 17)
                    antiDiagonalSum = grid[i][j] * grid[i - 1][j + 1] * grid[i - 2][j + 2] * grid[i - 3][j + 3];

                maxSum = Collections.max(Arrays.asList(horizontalSum, verticalSum, diagonalSum, antiDiagonalSum, maxSum));
            }
        }
        out.println(maxSum);
    }

    public ProjectEuler_11_LargestProductInAGrid() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return st.nextToken();
    }

    private short nextShort() throws IOException {
        return Short.parseShort(nextToken());
    }
}
