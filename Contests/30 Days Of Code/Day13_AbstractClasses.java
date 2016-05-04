import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/30-days-of-code/challenges/day-13-abstract-classes">https://www.hackerrank.com/contests/30-days-of-code/challenges/day-13-abstract-classes</a>
 * @since 1/13/16
 */

public class Day13_AbstractClasses {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day13_AbstractClasses();
    }

    void solve() throws IOException {
        int n = nextInt();
        //TODO the code goes here
    }

    //Write MyBook Class
    //TODO just need these lines of code
//    class MyBook extends Book{
//
//        int price;
//
//        MyBook(String title, String author, int price){
//            super(title, author);
//            this.price = price;
//        }
//
//        void display(){
//            System.out.println("Title: "+title);
//            System.out.println("Author: "+author);
//            System.out.println("Price: "+price);
//        }
//    }

    Day13_AbstractClasses() throws IOException {
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
