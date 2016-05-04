import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler006">https://www.hackerrank.com/contests/projecteuler/challenges/euler006</a>
 * @since 2/10/16
 */

public class ProjectEuler_6_SumSquareDifference {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new ProjectEuler_6_SumSquareDifference();
    }

    private void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            int n = nextInt();
            BigInteger sumNaturalSquares = BigInteger.valueOf((long) getSumNaturalSquares(n));
            BigInteger triangularNumber = BigInteger.valueOf((long) getTriangularNumber(n));
            out.println(triangularNumber.pow(2).subtract(sumNaturalSquares));
        }
    }

    private double getSumNaturalSquares(double n) {
        return n * (n + 1.0) * (2.0 * n + 1.0) / 6.0;
    }

    private double getTriangularNumber(double n) {
        return n * (n + 1.0) / 2.0;
    }

    public ProjectEuler_6_SumSquareDifference() throws IOException {
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

    private int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
}
