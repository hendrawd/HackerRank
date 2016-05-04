import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/security-encryption-scheme">https://www.hackerrank.com/challenges/security-encryption-scheme</a>
 * @since 2/9/16
 */

public class SecurityEncryptionScheme {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new SecurityEncryptionScheme();
    }

    private void solve() throws IOException {
        //it is just a simple factorial i think
        int k = nextInt();
        for (int i = k - 1; i > 1; i--) {
            k *= i;
        }
        out.print(k);
    }

    public SecurityEncryptionScheme() throws IOException {
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
}
