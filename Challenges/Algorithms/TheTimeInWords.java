import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 1/5/16.
 *
 * @see <a href="https://www.hackerrank.com/challenges/the-time-in-words">https://www.hackerrank.com/challenges/the-time-in-words</a>
 */
public class TheTimeInWords {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    String numbers[] = {
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine"
    };


    public static void main(String[] args) throws IOException {
        new TheTimeInWords();
    }

    void solve() throws IOException {
        int h = nextInt();
        int m = nextInt();
        String result;
        if (m == 0) {
            result = numbers[h - 1] + " o' clock";
        } else if (m == 15) {
            result = "quarter past " + numbers[h - 1];
        } else if (m == 30) {
            result = "half past " + numbers[h - 1];
        } else if (m == 45) {
            result = "quarter to " + numbers[h];
        } else if (m == 1) {
            result = "one minute past " + numbers[h - 1];
        } else if(m == 59){
            result = "one minute to " + numbers[h];
        }else {
            if (m > 30) {
                m = 60 - m;
                result = numbers[m - 1] + " minutes to " + numbers[h];
            } else {
                result = numbers[m - 1] + " minutes past " + numbers[h - 1];
            }
        }
        out.println(result);
    }

    TheTimeInWords() throws IOException {
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
