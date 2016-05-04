import java.io.*;
import java.util.*;

/**
* solution to https://www.hackerrank.com/challenges/service-lane/copy-from/15963018
*/

public class ServiceLane {
    
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;

    void solve() throws IOException {
        int n = nextInt();
        int t = nextInt();
        int aN[] = new int[n];
        for (int i = 0; i < n; i++) {
            aN[i] = nextInt();
        }
        for (int i = 0; i < t; i++) {
            int max = 3;
            int a = nextInt();
            int b = nextInt();
            for (; a <= b; a++) {
                max = aN[a] < max ? aN[a] : max;
            }
            out.println(max);
        }
    }

    ServiceLane() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new ServiceLane();
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