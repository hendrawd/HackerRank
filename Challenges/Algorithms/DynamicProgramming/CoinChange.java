import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/coin-change">https://www.hackerrank.com/challenges/coin-change</a>
 * @since 1/12/16
 */

public class CoinChange {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new CoinChange();
    }

    void solve() throws IOException {
        int n = nextInt();
        int c = nextInt();
        long pecahan[] = new long[c];
        for (int i = 0; i < c; i++) {
            pecahan[i] = nextLong();
        }
        long counter[][] = new long[n + 1][c];
        for (int i = 0; i < c; i++) {
            counter[0][i] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < c; j++) {
                long a, b;
                a = i - pecahan[j] > -1 ? counter[i - (int) pecahan[j]][j] : 0;
                b = j > 0 ? counter[i][j - 1] : 0;
                counter[i][j] = a + b;
            }
        }
        out.println(counter[n][c - 1]);
    }

    CoinChange() throws IOException {
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
