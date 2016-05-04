import java.io.*;
import java.util.*;
// https://www.hackerrank.com/challenges/anagram
public class Anagram {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;

    void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            String s = nextToken();
            if(s.length()%2==1){
                out.println(-1);    
            }
            else{
                printMinimalChangeEffort(s);
            }
        }
    }

    void printMinimalChangeEffort(String s){
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        int index = 0;
        int midIndex = s.length() / 2;
        for (; index < midIndex; index++) {
            char c = s.charAt(index);
            int integer = 0;
            Integer oInteger = hm1.get(c);
            if (oInteger != null) {
                integer = oInteger;
            }
            hm1.put(c, integer + 1);
        }
        for (; index < s.length(); index++) {
            char c = s.charAt(index);
            int integer = 0;
            Integer oInteger1 = hm1.get(c);
            if (oInteger1 != null) {
                integer = oInteger1 - 1;
                if (integer != 0)
                    hm1.put(c, integer);
                else
                    hm1.remove(c);
            } else {
                Integer oInteger2 = hm2.get(c);
                if (oInteger2 != null) {
                    integer = oInteger2;
                }
                hm2.put(c, integer + 1);
            }
        }
        int count = 0;
        for (Character c : hm1.keySet()) {
            count += hm1.get(c);
        }
        out.println(count);

//        out.println("start of hm1");
//        for (Character c : hm1.keySet()) {
//            out.println("key = "+c+", integer = "+hm1.get(c));
//        }
//        out.println("start of hm2");
//        for (Character c : hm2.keySet()) {
//            out.println("key = "+c+", integer = "+hm2.get(c));
//        }
    }
    
    Anagram() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Anagram();
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

    String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            eof = true;
            return null;
        }
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