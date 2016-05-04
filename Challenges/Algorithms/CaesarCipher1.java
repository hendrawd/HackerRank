import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 12/25/15.
 * for https://www.hackerrank.com/challenges/caesar-cipher-1
 */
public class CaesarCipher1 {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;

    public static void main(String[] args) throws IOException {
        new CaesarCipher1();
    }

    void solve() throws IOException {
        int n = nextInt();
        String s = nextToken();
        int r = nextInt();
        for (int i = 0; i < n; i++) {
            out.print((char) rotate(s.charAt(i), r));
        }
    }

    private int rotate(char c, int r) {
        if (c >= 97 && c <= 122) {
            if (c + r <= 122) {
                return c + r;
            } else {
                int a = 123 - c;
                r -= a;
                return 97 + r % 26;
            }
        }
        if (c >= 65 && c <= 90) {
            if (c + r <= 90) {
                return c + r;
            } else {
                int a = 91 - c;
                r -= a;
                return 65 + r % 26;
            }
        }
        return c;
    }

    CaesarCipher1() throws IOException {
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
