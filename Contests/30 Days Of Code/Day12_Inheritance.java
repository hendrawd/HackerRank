import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/30-days-of-code/challenges/inheritance">https://www.hackerrank.com/contests/30-days-of-code/challenges/inheritance</a>
 * @since 1/12/16
 */

public class Day12_Inheritance {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day12_Inheritance();
    }

    void solve() throws IOException {
        int n = nextInt();
        //TODO the code goes here
    }

    //just need this class
//    class Grade extends Student {
//        private int score;
//
//        public Grade(String s1, String s2, int i1, int i2) {
//            super(s1, s2, i1);
//            this.score = i2;
//        }
//
//        public char Calculate() {
//            if (score < 40) {
//                return 'D';
//            } else if (score >= 40 && score < 60) {
//                return 'B';
//            } else if (score >= 60 && score < 75) {
//                return 'A';
//            } else if (score >= 75 && score < 90) {
//                return 'E';
//            } else {
//                return 'O';
//            }
//        }
//    }

    Day12_Inheritance() throws IOException {
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
