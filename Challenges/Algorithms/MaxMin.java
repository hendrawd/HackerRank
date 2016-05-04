import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/angry-children">https://www.hackerrank.com/challenges/angry-children</a>
 * @since 1/6/16
 */
public class MaxMin {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new MaxMin();
    }

    void solve() throws IOException {
        int n = nextInt();
        int k = nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = nextInt();
        int unfairness = Integer.MAX_VALUE;
        Arrays.sort(list);
        for (int i = 0; i < n - k + 1; i++) {
            int currDelta = list[i + k - 1] - list[i];
            if (currDelta < unfairness) {
                unfairness = currDelta;
            }
        }
        out.println(unfairness);
    }

    MaxMin() throws IOException {
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
