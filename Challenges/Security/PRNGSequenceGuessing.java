import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/prng-sequence-guessing">https://www.hackerrank.com/challenges/prng-sequence-guessing</a>
 * @since 2/9/16
 */

public class PRNGSequenceGuessing {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new PRNGSequenceGuessing();
    }

    private void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            long first = nextLong();
            long second = nextLong();
            int[] numberSequence = new int[10];
            for (int i = 0; i < 10; i++) {
                numberSequence[i] = nextInt();
            }
            for (; first <= second; first++) {
                Random r = new Random(first);
                boolean isFound = true;
                for (int i = 0; i < 10; i++) {
                    if (numberSequence[i] != r.nextInt(1000)) {
                        isFound = false;
                        break;
                    }
                }
                if (isFound) {
                    out.print(first + " ");
                    for (int i = 0; i < 10; i++) {
                        out.print(r.nextInt(1000) + " ");
                    }
                    break;
                }
            }
            out.println();
        }
    }

    public PRNGSequenceGuessing() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    private String nextToken() {
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
}
