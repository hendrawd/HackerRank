import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/fibonacci-modified">https://www.hackerrank.com/challenges/fibonacci-modified</a>
 * @since 1/12/16
 */

public class FibonacciModified {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new FibonacciModified();
    }

    void solve() throws IOException {
        int a = nextInt();
        int b = nextInt();
        int n = nextInt();
        out.println(getFibo(BigInteger.valueOf(a), BigInteger.valueOf(b), n - 2));
    }

    private BigInteger getFibo(BigInteger a, BigInteger b, int n) {
        if (n == 0)
            return b;
        else
            return getFibo(b, b.pow(2).add(a), n - 1);
    }

    FibonacciModified() throws IOException {
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
