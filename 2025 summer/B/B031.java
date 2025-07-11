import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3135
public class B031 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int gap = Math.abs(A - B);

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            temp = Math.abs(temp - B);
            if (gap > temp) {
                gap = temp + 1;
            }
        }

        System.out.println(gap);
    }
}
