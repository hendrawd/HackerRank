import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 1/5/16.
 *
 * @see <a href="https://www.hackerrank.com/contests/30-days-of-code/challenges/day-5-loops">https://www.hackerrank.com/contests/30-days-of-code/challenges/day-5-loops</a>
 */
public class Loops {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Loops();
    }

    void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            int a = nextInt();
            int b = nextInt();
            int N = nextInt();

            for (int i = 0; i < N; i++) {
                a += (int) Math.pow(2, i) * b;
                out.print(a + " ");
            }
            out.println();
        }
    }

    Loops() throws IOException {
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
