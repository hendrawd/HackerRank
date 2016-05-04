import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/security-key-spaces">https://www.hackerrank.com/challenges/security-key-spaces</a>
 * @since 2/9/16
 */

public class SecurityKeySpaces {
    private BufferedReader br;
    private PrintWriter out;

    public static void main(String[] args) throws IOException {
        new SecurityKeySpaces();
    }

    private void solve() throws IOException {
        //shift int in the range of 0-9
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int key = Integer.parseInt(br.readLine());
        for (int i = 0; i < s.length(); i++) {
            int result = Character.getNumericValue(s.charAt(i)) + key;
            while (result > 9) {
                result -= 10;
            }
            sb.append(result);
        }
        out.print(sb.toString());
    }

    public SecurityKeySpaces() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
}
