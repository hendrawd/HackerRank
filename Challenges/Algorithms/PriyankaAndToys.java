import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/priyanka-and-toys">https://www.hackerrank.com/challenges/priyanka-and-toys</a>
 * @since 1/6/16
 */
public class PriyankaAndToys {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new PriyankaAndToys();
    }

    void solve() throws IOException {
        int n = nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }
        Arrays.sort(arr);
        int currentMin = arr[0];
        int counter = 1;
        for (int i = 1; i < n; i++) {
            if (!isInRange(arr[i], currentMin, currentMin + 4)) {
                counter++;
                currentMin = arr[i];
            }
        }
        out.println(counter);
    }

    private boolean isInRange(int target, int min, int max) {
        if (target >= min && target <= max) {
            return true;
        }
        return false;
    }

    PriyankaAndToys() throws IOException {
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
