import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/security-involution">https://www.hackerrank.com/challenges/security-involution</a>
 * @since 1/29/16
 */

public class SecurityInvolution {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new SecurityInvolution();
    }

    void solve() throws IOException {
        int n = nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, nextInt());
        }
        Iterator it = map.entrySet().iterator();
        List<Integer> listFValue = new ArrayList<>();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            listFValue.add((Integer) pair.getValue());
        }
        List<Integer> listFMirrorValue = new ArrayList<>();
        for (Integer aListFValue : listFValue) {
            listFMirrorValue.add(map.get(aListFValue));
        }
        Collections.sort(listFValue);
        Collections.sort(listFMirrorValue);
        out.print(listFValue.equals(listFMirrorValue) ? "YES" : "NO");
    }

    SecurityInvolution() throws IOException {
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
