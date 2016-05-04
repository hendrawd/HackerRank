import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 1/5/16.
 *
 * @see <a href="https://www.hackerrank.com/challenges/encryption">https://www.hackerrank.com/challenges/encryption</a>
 */
class Encryption {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Encryption();
    }

    void solve() throws IOException {
        String input = nextToken();
        int length = input.length();
        int ceil = (int) Math.ceil(Math.sqrt(length));
        char ch[][] = new char[ceil][ceil];
        for (int i = 0, cutIndex = 0; i < ceil; i++) {
            for (int j = 0; j < ceil; j++) {
                if (cutIndex + 1 > length) {
                    break;
                }
                ch[i][j] = input.subSequence(cutIndex, cutIndex + 1).charAt(0);
                cutIndex++;
            }
        }
        for (int i = 0; i < ceil; i++) {
            for (int j = 0; j < ceil; j++) {
                if (Character.isAlphabetic(ch[j][i])) {
                    out.print(ch[j][i]);
                }
            }
            out.print(" ");
        }
    }

    Encryption() throws IOException {
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
}
