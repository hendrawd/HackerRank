import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 1/3/16.
 *
 * @see https://www.hackerrank.com/challenges/cavity-map
 */
public class CavityMap {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new CavityMap();
    }

    void solve() throws IOException {
        int n = nextInt();
        int ar[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = nextToken();
            for (int j = 0; j < line.length(); j++) {
                ar[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //border condition
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    out.print(ar[i][j]);
                } else {
                    //condition greater than left, top, right, bottom respectively
                    if (ar[i][j] > ar[i][j - 1] &&
                            ar[i][j] > ar[i - 1][j] &&
                            ar[i][j] > ar[i][j + 1] &&
                            ar[i][j] > ar[i + 1][j]) {
//                        out.println("i = " + i);
//                        out.println("j = " + j);
//                        out.println("current = " + ar[i][j]);
//                        out.println("left = " + ar[i][j - 1]);
//                        out.println("top = " + ar[i + 1][j]);
//                        out.println("right = " + ar[i][j + 1]);
//                        out.println("bottom = " + ar[i + 1][j]);
                        out.print("X");
                    } else {
                        out.print(ar[i][j]);
                    }
                }
            }
            out.println();
        }
    }

    CavityMap() throws IOException {
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
