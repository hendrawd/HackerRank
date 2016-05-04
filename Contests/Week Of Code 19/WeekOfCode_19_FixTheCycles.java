import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/w19/challenges/fix-the-cycles">https://www.hackerrank.com/contests/w19/challenges/fix-the-cycles</a>
 * @since 2/15/16
 */

public class WeekOfCode_19_FixTheCycles {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new WeekOfCode_19_FixTheCycles();
    }

    private void solve() throws IOException {
//        cycle 1 = ade
//        cycle 2 = abf
//        cycle 3 = abcd
        int inputs[] = new int[6];
        for (int i = 0; i < 6; i++) {
            inputs[i] = nextInt();
        }
        int min = inputs[0] + inputs[3] + inputs[4];
        int current = inputs[0] + inputs[1] + inputs[5];
        min = current < min ? current : min;
        current = inputs[0] + inputs[1] + inputs[2] + inputs[3];
        min = current < min ? current : min;
        if (min < 0)
            out.print(Math.abs(min));
        else
            out.print(-1);
    }

    public WeekOfCode_19_FixTheCycles() throws IOException {
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

    private int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
}
