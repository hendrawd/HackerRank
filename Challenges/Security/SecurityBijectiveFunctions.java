import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/security-bijective-functions">https://www.hackerrank.com/challenges/security-bijective-functions</a>
 * @since 1/28/16
 */

public class SecurityBijectiveFunctions {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new SecurityBijectiveFunctions();
    }

    void solve() throws IOException {
        int n = nextInt();
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(nextInt());
        }
        if (s.size() < n) {
            out.print("NO");
        } else {
            out.print("YES");
        }
    }

    SecurityBijectiveFunctions() throws IOException {
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
