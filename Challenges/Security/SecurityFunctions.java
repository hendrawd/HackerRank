import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/security-tutorial-functions">https://www.hackerrank.com/challenges/security-tutorial-functions</a>
 * @since 1/28/16
 */

public class SecurityFunctions {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;


    public static void main(String[] args) throws IOException {
        new SecurityFunctions();
    }

    void solve() throws IOException {
        out.print(f1(nextInt()));
    }

    private int f1(int x) {
        return x % 11;
    }

    SecurityFunctions() throws IOException {
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
