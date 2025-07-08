import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17211
public class A030 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        double good = Integer.parseInt(st.nextToken());

        double[] p = new double[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            p[i] = Double.parseDouble(st.nextToken());
        }

        good = 1000 * (1 - good);

        for (int i = 1; i <= N; i++) {
            good = (good * p[0]) + ((1000 - good) * p[2]);
        }

        System.out.printf("%d\n%d", (int) good, (int) (1000 - good));
    }
}
