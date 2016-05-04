import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Looks like hourglass challenge from algorithm if i am not wrong
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/30-days-of-code/challenges/day-11-more-review">https://www.hackerrank.com/contests/30-days-of-code/challenges/day-11-more-review</a>
 * @since 1/12/16
 */

public class Day11_2D_Arrays {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day11_2D_Arrays();
    }

    void solve() throws IOException {
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = nextInt();
            }
        }
        int largest = Integer.MIN_VALUE;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                int hg = arr[i][j] + arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
                largest = hg > largest ? hg : largest;
            }
        }
        out.print(largest);
    }

    Day11_2D_Arrays() throws IOException {
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

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}
