import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/keyword-transposition-cipher">https://www.hackerrank.com/challenges/keyword-transposition-cipher</a>
 * @since 2/9/16
 */

public class KeywordTranspositionCipher {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new KeywordTranspositionCipher();
    }

    private void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            String key = br.readLine();
            char[] keys = key.toCharArray();
            removeDuplicates(keys);
            HashMap<Character, Character> hm = getKeyMapping(keys);
            String[] msg = br.readLine().split("\\s+");
            for (String aMsg : msg) {
                for (int i = 0; i < aMsg.length(); i++) {
                    out.print(hm.get(aMsg.charAt(i)));
                }
                out.print(" ");
            }
            out.println();
        }
    }

    private HashMap<Character, Character> getKeyMapping(char[] keys) {
        HashMap<Character, Character> keyMapping = new HashMap<>(26);
        List<Character> charList = new ArrayList<>();
        for (char key : keys) {
            if (key != Character.MIN_VALUE)
                charList.add(key);
        }
        double ceil = Math.ceil((double) 26 / charList.size());
        int index = 0;
        Character[][] chars = new Character[(int) ceil][charList.size()];
        for (char c : charList) {
            chars[0][index] = c;
            index++;
        }
        int currentChar = 65;
        for (int i = 1; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (!charList.contains((char) currentChar)) {
                    chars[i][j] = (char) currentChar;
                } else {
                    j--;
                }
                currentChar++;
            }
        }

        Character[][] reverseChar = reverseArray(chars);
        Arrays.sort(reverseChar, (entry1, entry2) -> {
            final Character c1 = entry1[0];
            final Character c2 = entry2[0];
            return c1.compareTo(c2);
        });
        int adder = 0;
        for (Character[] aReverseChar : reverseChar) {
            for (Character theChar : aReverseChar) {
                if (theChar >= 65 && theChar <= 90) {
                    keyMapping.put(theChar, (char) (65 + adder));
                    adder++;
                } else {
                    break;
                }
            }
        }
        return keyMapping;
    }

    private Character[][] reverseArray(Character[][] chars) {
        Character[][] reverseChars = new Character[chars[0].length][chars.length];
        for (int i = 0; i < chars[0].length; i++) {
            for (int j = 0; j < chars.length; j++) {
                reverseChars[i][j] = chars[j][i];
            }
        }
        return reverseChars;
    }

    private void removeDuplicates(char[] str) {
        if (str == null) {
            return;
        }
        int len = str.length;
        if (len < 2) {
            return;
        }
        int tail = 1;
        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }
        }
        for (; tail < len; tail++) {
            str[tail] = 0;
        }
    }

    public KeywordTranspositionCipher() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    private String nextToken() {
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
}
