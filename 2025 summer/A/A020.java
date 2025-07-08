import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2455
public class A020 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int max = 0;

        int in, out, now = 0;

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            in = Integer.parseInt(st.nextToken());
            out = Integer.parseInt(st.nextToken());

            now += (out - in);
            max = Math.max(max, now);
        }

        System.out.println(max);
    }
}
