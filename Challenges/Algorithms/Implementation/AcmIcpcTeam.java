import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by hendrawd on 1/5/16.
 *
 * @see <a href="https://www.hackerrank.com/challenges/acm-icpc-team">https://www.hackerrank.com/challenges/acm-icpc-team</a>
 */
public class AcmIcpcTeam {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new AcmIcpcTeam();
    }

    void solve() throws IOException {
        int peopleSum = nextInt();
        int caseSum = nextInt();
        boolean bCases[][] = new boolean[peopleSum][caseSum];
        for (int i = 0; i < peopleSum; i++) {
            String line = nextToken();
            for (int j = 0; j < caseSum; j++) {
                if (line.subSequence(j, j + 1).charAt(0) == '1') {
                    bCases[i][j] = true;
                } else {
                    bCases[i][j] = false;
                }
            }
        }
        int maxCaseCanBeAchieved = 0;
        int maxTeamCanAchieveMax = 0;
        for (int i = 0; i < peopleSum; i++) {
            for (int j = i + 1; j < peopleSum; j++) {
                int currentMaxCaseCanBeAchieved = 0;
                for (int k = 0; k < caseSum; k++) {
                    if (bCases[i][k] || bCases[j][k]) {
                        currentMaxCaseCanBeAchieved++;
                    }
                }
                if (currentMaxCaseCanBeAchieved > maxCaseCanBeAchieved) {
                    maxCaseCanBeAchieved = currentMaxCaseCanBeAchieved;
                    maxTeamCanAchieveMax = 1;
                } else if (currentMaxCaseCanBeAchieved == maxCaseCanBeAchieved) {
                    maxTeamCanAchieveMax++;
                }
            }
        }
        out.println(maxCaseCanBeAchieved);
        out.println(maxTeamCanAchieveMax);
    }

    AcmIcpcTeam() throws IOException {
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
