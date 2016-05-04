import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 1/3/16.
 */
public class IfStatements {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new IfStatements();
    }

    void solve() throws IOException {
        int n = nextInt();
        if (n % 2 == 1) {
            out.println("Weird");
        } else {
            if (n > 1 && n < 6) {
                out.println("Not Weird");
            } else if (n > 5 && n < 21) {
                out.println("Weird");
            } else {
                out.println("Not Weird");
            }
        }
    }

    IfStatements() throws IOException {
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

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
}
