import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler017">https://www.hackerrank.com/contests/projecteuler/challenges/euler017</a>
 * @since 3/7/16
 */

public class ProjectEuler_17_NumberToWords {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new ProjectEuler_17_NumberToWords();
    }

    private void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            out.println(convert(nextLong()));
        }
    }

    public ProjectEuler_17_NumberToWords() throws IOException {
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

    private int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    private long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    private static final String[] specialNames = {
            "",
            " Thousand",
            " Million",
            " Billion",
            " Trillion",
            " Quadrillion",
            " Quintillion"
    };

    private static final String[] tensNames = {
            "",
            " Ten",
            " Twenty",
            " Thirty",
            " Forty",
            " Fifty",
            " Sixty",
            " Seventy",
            " Eighty",
            " Ninety"
    };

    private static final String[] numNames = {
            "",
            " One",
            " Two",
            " Three",
            " Four",
            " Five",
            " Six",
            " Seven",
            " Eight",
            " Nine",
            " Ten",
            " Eleven",
            " Twelve",
            " Thirteen",
            " Fourteen",
            " Fifteen",
            " Sixteen",
            " Seventeen",
            " Eighteen",
            " Nineteen"
    };

    private String convertLessThanOneThousand(int number) {
        String current;

        if (number % 100 < 20) {
            current = numNames[number % 100];
            number /= 100;
        } else {
            current = numNames[number % 10];
            number /= 10;

            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " Hundred" + current;
    }

    public String convert(long number) {

        if (number == 0) {
            return "Zero";
        }

        String prefix = "";

        if (number < 0) {
            number = -number;
            prefix = "Negative";
        }

        String current = "";
        int place = 0;

        do {
            long n = number % 1000;
            if (n != 0) {
                String s = convertLessThanOneThousand((int) n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);

        return (prefix + current).trim();
    }
}
