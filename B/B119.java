import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// https://www.acmicpc.net/problem/2204 B119
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int N = Integer.parseInt(br.readLine());

            if (N == 0) break;

            String[] str = new String[N];
            for (int i = 0; i < N; i++) {
                str[i] = br.readLine();
            }

            Arrays.sort(str, Comparator.comparing(String::toLowerCase));

            sb.append(str[0]).append("\n");
        }

        System.out.println(sb);
    }
}
