import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/stockmax">https://www.hackerrank.com/challenges/stockmax</a>
 * @since 1/13/16
 */

public class StockMaximize {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new StockMaximize();
    }

    void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            int n = nextInt();
            int prices[] = new int[n];
            for (int i = 0; i < n; i++) {
                prices[i] = nextInt();
            }
            long counter = 0;
            //the idea is save last max value int so we don't need to iterate every ith item
            //only when the current max value is == ith item value
            int currentMax = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                currentMax = prices[j] > currentMax ? prices[j] : currentMax;
            }
            for (int i = 0; i < n; i++) {
                if (prices[i] == currentMax) {
                    currentMax = Integer.MIN_VALUE;
                    for (int j = i + 1; j < n; j++) {
                        currentMax = prices[j] > currentMax ? prices[j] : currentMax;
                    }
                }
                if (currentMax > prices[i]) {
                    counter += currentMax - prices[i];
                }
            }
            out.println(counter);
        }
    }

    StockMaximize() throws IOException {
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
