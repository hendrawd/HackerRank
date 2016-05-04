import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/saveprincess">https://www.hackerrank.com/challenges/saveprincess</a>
 * @since 2/4/16
 */

public class SavePrincess {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new SavePrincess();
    }

    private void solve() throws IOException {
        int t = nextInt();
        int botX = -1;
        int botY = -1;
        int pX = -1;
        int pY = -1;
        for (int i = 0; i < t; i++) {
            String line = br.readLine();
            for (int j = 0; j < t; j++) {
                if (line.charAt(j) == 'm') {
                    botX = j;
                    botY = i;
                } else if (line.charAt(j) == 'p') {
                    pX = j;
                    pY = i;
                }
                if (botX != -1 && botY != -1 && pX != -1 && pY != -1) {
                    //no need to iterate more, since we already have the locations
                    break;
                }
            }
        }
        int deltaX = pX - botX;
        int deltaY = pY - botY;
        for (; deltaX != 0; ) {
            if (deltaX < 0) {
                deltaX++;
                moveLeft();
            }
            if (deltaX > 0) {
                deltaX--;
                moveRight();
            }
        }
        for (; deltaY != 0; ) {
            if (deltaY < 0) {
                deltaY++;
                moveUp();
            }
            if (deltaY > 0) {
                deltaY--;
                moveDown();
            }
        }
    }

    private void moveLeft() {
        out.println("LEFT");
    }

    private void moveUp() {
        out.println("UP");
    }

    private void moveRight() {
        out.println("RIGHT");
    }

    private void moveDown() {
        out.println("DOWN");
    }

    SavePrincess() throws IOException {
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
