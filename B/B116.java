import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3460
public class B116 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;

            while (N != 0) {
                if (N % 2 == 1) sb.append(count).append(" ");
                N /= 2;
                count++;
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
