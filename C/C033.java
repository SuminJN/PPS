import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2783
public class C033 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        double min = 100001.0;

        min = Math.min(min, 1000.0 / y * x);

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            min = Math.min(min, 1000.0 / y * x);
        }

        System.out.printf("%.2f", min);
    }
}
