import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/two-arrays">https://www.hackerrank.com/challenges/two-arrays</a>
 * @since 1/6/16
 */
public class TwoArrays {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new TwoArrays();
    }

    void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            int length = nextInt();
            int maxVal = nextInt();
            int items[][] = new int[2][length];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < length; j++) {
                    items[i][j] = nextInt();
                }
            }
            Arrays.sort(items[0]);
            Arrays.sort(items[1]);
            boolean result = true;
            for (int i = 0; i < length; i++) {
                if (items[0][i] + items[1][length - 1 - i] < maxVal) {
                    result = false;
                    break;
                }
            }
            if (result)
                out.println("YES");
            else
                out.println("NO");
        }
    }

    TwoArrays() throws IOException {
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
