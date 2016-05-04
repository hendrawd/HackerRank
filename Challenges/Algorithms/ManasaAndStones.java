import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 1/3/16.
 *
 * @see https://www.hackerrank.com/challenges/manasa-and-stones
 */
public class ManasaAndStones {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new ManasaAndStones();
    }

    void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            int n = nextInt();
            int a = nextInt();
            int b = nextInt();
            if (a == b) {
                out.println(a * (n - 1));
            } else {
                int s = Math.min(a, b);
                int l = Math.max(a, b);
                int minSum = s * (n - 1);
                int maxSum = l * (n - 1);
                int diff = l - s;
                while (minSum <= maxSum) {
                    out.print(minSum + " ");
                    minSum += diff;
                }
                out.println();
            }
        }
    }

    ManasaAndStones() throws IOException {
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
