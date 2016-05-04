import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/security-tutorial-permutations">https://www.hackerrank.com/challenges/security-tutorial-permutations</a>
 * @since 1/29/16
 */

public class SecurityTutorialPermutations {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new SecurityTutorialPermutations();
    }

    private void solve() throws IOException {
        int n = nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, nextInt());
        }
        for (Object o : map.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            out.println(map.get(pair.getValue()));
        }
    }

    SecurityTutorialPermutations() throws IOException {
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

    private String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
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
