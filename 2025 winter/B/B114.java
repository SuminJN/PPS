import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10825 B114
public class Main {

    static class Score implements Comparable<Score> {
        String name;
        int kor;
        int eng;
        int math;

        public Score(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(Score o) {
            if (this.kor < o.kor) return 1;
            else if (this.kor > o.kor) return -1;
            else {
                if (this.eng > o.eng) return 1;
                else if (this.eng < o.eng) return -1;
                else {
                    if (this.math < o.math) return 1;
                    else if (this.math > o.math) return -1;
                    else return this.name.compareTo(o.name);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Score> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr.add(new Score(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(arr);

        for (int i = 0; i < N; i++) {
            System.out.println(arr.get(i).name);
        }
    }
}
