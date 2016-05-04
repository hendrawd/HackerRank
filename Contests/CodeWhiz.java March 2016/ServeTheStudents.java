import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/contests/codewhiz-java-march-2016/challenges/serve-the-students">https://www.hackerrank.com/contests/codewhiz-java-march-2016/challenges/serve-the-students</a>
 * @since 3/10/16
 */

public class ServeTheStudents {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new ServeTheStudents();
    }

    private void solve() throws IOException {
        int totalEvents = nextInt();
        List<Student> list = new ArrayList<>();
        while (totalEvents-- > 0) {
            String event = br.readLine();
            if (event.startsWith("ENTER")) {
                String[] split = event.split(" ");
                Student s = new Student(Integer.parseInt(split[3]), split[1], Double.parseDouble(split[2]));
                list.add(s);
            } else {
                if (!list.isEmpty()) {
                    list.sort(new StudentComparator());
                    list.remove(0);
                }
            }
//            out.println("Partial result ");
//            for (Student s : list) {
//                out.println(s.fname);
//            }
        }
        if (list.isEmpty()) {
            out.print("EMPTY");
        } else {
            list.sort(new StudentComparator());
//            out.println("Final result ");
            for (Student s : list) {
//                out.println(s.fname+" "+s.cgpa+" "+s.token);
                out.println(s.fname);
            }
        }
    }

    public ServeTheStudents() throws IOException {
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

    class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            int cgpaC = a.cgpa < b.cgpa ? 1 : a.cgpa == b.cgpa ? 0 : -1; //descending order
            if (cgpaC != 0)
                return cgpaC;
            int fnameC = a.fname.compareTo(b.fname);
            if (fnameC != 0)
                return fnameC;
            return a.token < b.token ? -1 : a.token == b.token ? 0 : 1;
        }
    }

    class Student {
        private int token;
        private String fname;
        private double cgpa;

        public Student(int id, String fname, double cgpa) {
            super();
            this.token = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        public int getToken() {
            return token;
        }

        public String getFname() {
            return fname;
        }

        public double getCgpa() {
            return cgpa;
        }
    }
}
