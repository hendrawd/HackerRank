import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 1/5/16.
 *
 * @see <a href="https://www.hackerrank.com/challenges/kaprekar-numbers">https://www.hackerrank.com/challenges/kaprekar-numbers</a>
 */
public class KaprekarNumbers {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new KaprekarNumbers();
    }

    void solve() throws IOException {
        int lowest = nextInt();
        int highest = nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = lowest; i <= highest; i++) {
            if (i == 1) {
                sb.append("1 ");
            } else {
                long multiplySelf = (long) i * i;
                String sMultiplySelf = multiplySelf + "";
                int cutLengthLow = (int) Math.floor(sMultiplySelf.length() / 2);
                int cutLengthHigh = (int) Math.ceil(sMultiplySelf.length() / 2);
                if (cutLengthLow == cutLengthHigh) {
                    String firstChunk = sMultiplySelf.substring(0, cutLengthLow);
                    String secondChunk = sMultiplySelf.substring(cutLengthLow);
                    if (firstChunk.length() != 0 && secondChunk.length() != 0) {
                        if (Integer.parseInt(firstChunk) + Integer.parseInt(secondChunk) == i) {
                            sb.append(i + " ");
                        }
                    }
                } else {
                    String firstChunk = sMultiplySelf.substring(0, cutLengthLow);
                    String secondChunk = sMultiplySelf.substring(cutLengthLow);
                    if (firstChunk.length() != 0 && secondChunk.length() != 0) {
                        if (Integer.parseInt(firstChunk) + Integer.parseInt(secondChunk) == i) {
                            sb.append(i + " ");
                        } else {
                            firstChunk = sMultiplySelf.substring(0, cutLengthHigh);
                            secondChunk = sMultiplySelf.substring(cutLengthHigh);
                            if (firstChunk.length() != 0 && secondChunk.length() != 0) {
                                if (Integer.parseInt(firstChunk) + Integer.parseInt(secondChunk) == i) {
                                    sb.append(i + " ");
                                }
                            }
                        }
                    }
                }
            }
        }
        if (sb.length() == 0) {
            out.println("INVALID RANGE");
        } else {
            out.println(sb.toString());
        }
    }

    KaprekarNumbers() throws IOException {
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
