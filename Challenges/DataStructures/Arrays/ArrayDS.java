import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 1/1/16.
 * @see https://www.hackerrank.com/challenges/arrays-ds
 */
class ArrayDS {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new ArrayDS();
    }

    void solve() throws IOException {
        int n = nextInt();
        int array[] = new int[n];
        while (--n > -1) {
            array[n] = nextInt();
        }
        n = 0;
        for (; n < array.length; n++) {
            out.print(array[n] + " ");
        }
    }

    ArrayDS() throws IOException {
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
