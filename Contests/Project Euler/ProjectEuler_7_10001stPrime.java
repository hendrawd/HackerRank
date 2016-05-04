import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler007">https://www.hackerrank.com/contests/projecteuler/challenges/euler007</a>
 * @since 2/11/16
 */

public class ProjectEuler_7_10001stPrime {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;
    private ArrayList<Integer> primes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        new ProjectEuler_7_10001stPrime();
    }

    private void solve() throws IOException {
        int t = nextInt();
        int max = Integer.MIN_VALUE;
        int arrays[] = new int[t];
        for (int i = 0; i < t; i++) {
            int n = nextInt();
            max = n > max ? n : max;
            arrays[i] = n;
        }
        generatePrimes(max);
        for (int array : arrays) {
            out.println(primes.get(array - 1));
        }
    }

    private void generatePrimes(int nth) {
        int num = 3;
        int status = 1;
        primes.add(2);
        for (int i = 2; i <= nth; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                primes.add(num);
                i++;
            }
            status = 1;
            num++;
        }
    }

    public ProjectEuler_7_10001stPrime() throws IOException {
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
