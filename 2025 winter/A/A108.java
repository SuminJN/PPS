import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3062
public class A108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringBuilder sb = new StringBuilder();
            sb.append(br.readLine());
            int sum = Integer.parseInt(sb.toString()) + Integer.parseInt(sb.reverse().toString());

            sb = new StringBuilder();
            sb.append(sum);

            if (sb.toString().contentEquals(sb.reverse())) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
