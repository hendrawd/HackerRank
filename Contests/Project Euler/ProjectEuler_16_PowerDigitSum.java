import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler016">https://www.hackerrank.com/contests/projecteuler/challenges/euler016</a>
 * @since 3/8/16
 */

public class ProjectEuler_16_PowerDigitSum {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new ProjectEuler_16_PowerDigitSum();
    }

    private void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            int n = nextInt();
            BigInteger two = BigInteger.valueOf(2);
            String s = two.pow(n).toString();
//            out.println(s);
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
//                out.println("t = " + t + "Character numberic value = " + Character.getNumericValue(s.charAt(i)));
                counter += Character.getNumericValue(s.charAt(i));
            }
            out.println(counter);
        }
    }

    public ProjectEuler_16_PowerDigitSum() throws IOException {
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

    private long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    private double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}
