import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10995
public class A199 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0) sb.append(" ");

            for (int j = 1; j <= N; j++) {
                sb.append("* ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
