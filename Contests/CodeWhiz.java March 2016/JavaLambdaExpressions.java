import java.io.*;
import java.util.*;

interface performOperation {
    int check(int a);
}

class Math {
    public static int checker(performOperation p, int num) {
        return p.check(num);
    }

    performOperation checkEvenOdd() {
        return a -> {
            if (a % 2 == 0)
                return 0;
            return 1;
        };
    }

    performOperation checkPrime() {
        return a -> {
            if (a < 2) return 1;
            if (a == 2 || a == 3) return 0;
            if (a % 2 == 0 || a % 3 == 0) return 1;
            long sqrtN = (long) java.lang.Math.sqrt(a) + 1;
            for (long i = 6L; i <= sqrtN; i += 6) {
                if (a % (i - 1) == 0 || a % (i + 1) == 0) return 1;
            }
            return 0;
        };
    }

    performOperation checkPalindrome() {
        return a -> {
            String s = a + "";
            String reverse = new StringBuilder(s).reverse().toString();
            if (s.equals(reverse))
                return 0;
            return 1;
        };
    }
}

public class JavaLambdaExpressions {

    public static void main(String[] args) throws IOException {
        Math ob = new Math();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        performOperation op;
        int ret = 0;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.checkEvenOdd();
                ret = ob.checker(op, num);
                ans = (ret == 0) ? "EVEN" : "ODD";
            } else if (ch == 2) {
                op = ob.checkPrime();
                ret = ob.checker(op, num);
                ans = (ret == 0) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.checkPalindrome();
                ret = ob.checker(op, num);
                ans = (ret == 0) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }

}
