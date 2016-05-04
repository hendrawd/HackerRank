import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/mark-and-toys">https://www.hackerrank.com/challenges/mark-and-toys</a>
 * @since 1/6/16
 */
public class MarkAndToys {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new MarkAndToys();
    }

    void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum <= m) {
                counter++;
            } else
                break;
        }
        out.print(counter);
    }

    MarkAndToys() throws IOException {
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
