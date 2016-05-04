import java.io.*;
import java.util.*;

/**
*   Created by hendrawd on 12/24/15
*   for https://www.hackerrank.com/challenges/cut-the-sticks
*/

public class CutTheSticks {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;
    int min = 0;
    List<Integer> aN;

    void solve() throws IOException {
        int n = nextInt();
        aN = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                min = nextInt();
                aN.add(min);
            } else {
                int a = nextInt();
                if (a != 0) {
                    aN.add(a);
                    min = a < min ? a : min;
                }
            }
        }
        if (min == 0) {
            out.println(0);
            return;
        }
        cuts();
    }

    private void cuts() {
        while (min != 0) {
            int size = aN.size();
            out.println(size);
            int currentMin = 0;
            List<Integer> newList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int a = aN.get(i);
                int d = a - min;
                if (d != 0) {
                    newList.add(d);
                    if (currentMin == 0)
                        currentMin = d;
                    else
                        currentMin = d < currentMin ? d : currentMin;
                }
            }
            min = currentMin;
            aN = newList;
        }
    }

    CutTheSticks() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new CutTheSticks();
    }

    String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                eof = true;
                return null;
            }
        }
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
}