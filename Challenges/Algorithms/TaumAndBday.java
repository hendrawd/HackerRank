import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 1/3/16.
 *
 * @see <a href="https://www.hackerrank.com/challenges/taum-and-bday">https://www.hackerrank.com/challenges/taum-and-bday</a>
 */
public class TaumAndBday {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new TaumAndBday();
    }

    void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            //must define these variables to long, so the arithmetic calculation result will be long too
            //although the input is int, but the result is too big as an integer,
            //so long data type will be the solution
            long b = nextInt();
            long w = nextInt();
            long x = nextInt();
            long y = nextInt();
            long z = nextInt();
            long lowerCost = Math.min(x, y);
            long higherCost = Math.max(x, y);
            long result;
            if (lowerCost == higherCost) {
                result = b * x + w * y;
            } else {
                if (lowerCost + z >= higherCost) {
                    result = b * x + w * y;
                } else {
                    if (higherCost == x) {
                        result = b * (y + z) + w * y;
                    } else {
                        result = b * x + w * (x + z);
                    }
                }
            }
            out.println(result);
        }

    }

    TaumAndBday() throws IOException {
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
