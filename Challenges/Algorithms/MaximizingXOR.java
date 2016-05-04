import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/maximizing-xor">https://www.hackerrank.com/challenges/maximizing-xor</a>
 * @since 1/7/16
 */
public class MaximizingXOR {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new MaximizingXOR();
    }

    void solve() throws IOException {
        int L = nextInt();
        int R = nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = L; i <= R; i++) {
            for (int j = i; j <= R; j++) {
                int currentMax = i ^ j;
                if (currentMax > max)
                    max = currentMax;
            }
        }
        out.print(max);
    }

    MaximizingXOR() throws IOException {
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
}
