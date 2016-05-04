import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/sansa-and-xor">https://www.hackerrank.com/challenges/sansa-and-xor</a>
 * @since 1/7/16
 */
public class SansaAndXOR {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new SansaAndXOR();
    }

    void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            int N = nextInt();
            if (N % 2 == 0) {
                out.println(0);
                br.readLine();
            } else {
                int result = nextInt();
                nextToken();
                for (int i = 2; i < N; i++) {
                    int n = nextInt();
                    if (i % 2 == 0) {
                        result ^= n;
                    }
                }
                out.println(result);
            }
        }
    }

    SansaAndXOR() throws IOException {
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
