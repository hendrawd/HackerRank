import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 12/24/15.
 * for https://www.hackerrank.com/challenges/chocolate-feast
 */
public class ChocolateFeast {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;

    public static void main(String[] args) throws IOException {
        new ChocolateFeast();
    }

    void solve() throws IOException {
        int n = nextInt();
        while (n-- > 0) {
            int duit = nextInt();
            int harga = nextInt();
            int tukerCost = nextInt();
            int tot = duit / harga;
            int bungkus = tot;
            while (bungkus >= tukerCost) {
                int bonus = bungkus / tukerCost;
                bungkus %= tukerCost;
                tot += bonus;
                bungkus += bonus;
            }
            out.println(tot);
        }
    }

    ChocolateFeast() throws IOException {
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
