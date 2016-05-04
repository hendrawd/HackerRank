import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/30-days-of-code/challenges/day-25-running-time">https://www.hackerrank.com/contests/30-days-of-code/challenges/day-25-running-time</a>
 * @since 1/26/16
 */

public class Day25_RunningTimeAndComplexity {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day25_RunningTimeAndComplexity();
    }

    void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            int n = nextInt();
            BigInteger bi = BigInteger.valueOf(n);
            if (bi.isProbablePrime(1)) {
                out.println("Prime");
            } else {
                out.println("Not prime");
            }
        }
    }

    Day25_RunningTimeAndComplexity() throws IOException {
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
