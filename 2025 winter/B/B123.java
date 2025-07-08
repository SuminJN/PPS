import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/6588
public class B123 {

    static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] isPrime = new boolean[MAX + 1];

        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(MAX); i++) {
            if (!isPrime[i]) continue;

            for (int j = i * i; j <= MAX; j += i) {
                isPrime[j] = false;
            }
        }

        while (true) {
            int N = Integer.parseInt(br.readLine());

            if (N == 0) break;

            boolean flag = false;

            for (int i = 2; i <= N / 2; i++) {
                if (isPrime[i] && isPrime[N - i]) {
                    sb.append(N).append(" = ").append(i).append(" + ").append(N - i).append("\n");
                    flag = true;
                    break;
                }
            }
            if (!flag) sb.append("Goldbach's conjecture is wrong.\n");
        }

        System.out.println(sb);
    }
}
