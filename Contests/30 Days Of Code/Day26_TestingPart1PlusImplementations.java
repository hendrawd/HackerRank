import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/30-days-of-code/challenges/day-26-testing-part-1-plus-implementations">https://www.hackerrank.com/contests/30-days-of-code/challenges/day-26-testing-part-1-plus-implementations</a>
 * @since 1/27/16
 */

public class Day26_TestingPart1PlusImplementations {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day26_TestingPart1PlusImplementations();
    }

    void solve() throws IOException {
        int dr = nextInt();
        int mr = nextInt();
        int yr = nextInt();

        int d = nextInt();
        int m = nextInt();
        int y = nextInt();

        int fine = 0;

        if (yr > y) {
            fine = 10000;
        } else {
            if (mr > m) {
                fine = (mr - m) * 500;
            } else {
                if (dr > d) {
                    fine = (dr - d) * 15;
                }
            }
        }
        out.print(fine);
    }

    Day26_TestingPart1PlusImplementations() throws IOException {
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
