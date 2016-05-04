
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 12/25/15.
 * for https://www.hackerrank.com/challenges/sherlock-and-squares
 */
public class SherlockAndSquares {

    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;
    private boolean eof;

    public static void main(String[] args) throws IOException {
        new SherlockAndSquares();
    }

    void solve() throws IOException {
        int t = nextInt();
        for (int i = 0; i < t; i++) {
            int a = nextInt();
            int b = nextInt();
            out.println(((int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1)));
        }
    }

    SherlockAndSquares() throws IOException {
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
                eof = true;
                return null;
            }
        }
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
}
