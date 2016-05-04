import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/30-days-of-code/challenges/day-27-testing-part-2">https://www.hackerrank.com/contests/30-days-of-code/challenges/day-27-testing-part-2</a>
 * @since 1/28/16
 */

public class Day27_TestingPart2 {
    PrintWriter out;
    SecureRandom sr;

    public static void main(String[] args) throws IOException {
        new Day27_TestingPart2();
    }

    private void solve() throws IOException {
        //simplest method with fix test cases
        out.println("5");
        out.println("5 3");
        out.println("1 2 3 0 -1");
        out.println("6 3");
        out.println("-1 -2 -3 0 1 1");
        out.println("7 3");
        out.println("1 2 3 0 -1 2 2");
        out.println("8 3");
        out.println("1 2 3 0 -1 2 -2 -1");
        out.println("9 4");
        out.println("1 2 3 0 -1 2 -2 -1 7");

        //must remake these code if want to completely random test cases
//        Set<Integer> NSet = new HashSet<>();
////        int T = randInt(1, 5);
//        int T = 5;
//        out.println(T);
//        while (T-- > 0) {
//            int N = randInt(3, 200);
////        The value of N should be distinct across all the test cases.
//            while (NSet.contains(N)) {
//                N = randInt(3, 200);
//            }
//            NSet.add(N);
//            int K = randInt(1, N - 3);
//            out.println(N + " " + K);
//            int i = 0;
//            if (T % 2 == 1) {
//                for (; i < K; i++) {
//                    out.print(randInt(-1000, -1) + " ");
//                }
//            } else {
//                for (; i < K; i++) {
//                    out.print(randInt(1, 1000) + " ");
//                }
//            }
//            //        Array a must have at least one zero, one positive integer, and one negative integer.
//            int randomZeroIndex = randInt(K, N - 1);
//            int randomPositiveIndex = randInt(K, N - 1);
//            while (randomPositiveIndex == randomZeroIndex) {
//                randomPositiveIndex = randInt(K, N - 1);
//            }
//            int randomNegativeIndex = randInt(K, N - 1);
//            while (randomNegativeIndex == randomZeroIndex || randomNegativeIndex == randomPositiveIndex) {
//                randomNegativeIndex = randInt(K, N - 1);
//            }
//            for (; i < N; i++) {
//                if (i == randomZeroIndex)
//                    out.print("0 ");
//                else if (i == randomNegativeIndex)
//                    out.print(randInt(-1000, -1) + " ");
//                else if (i == randomPositiveIndex)
//                    out.print(randInt(1, 1000) + " ");
//                else
//                    out.print(randInt(-1000, 1000) + " ");
//            }
//            out.println();
//        }
    }

    Day27_TestingPart2() throws IOException {
        out = new PrintWriter(System.out);
        sr = new SecureRandom();
        solve();
        out.close();
    }

    private int randInt(int min, int max) {
        return sr.nextInt((max - min) + 1) + min;
    }
}
