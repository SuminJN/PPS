import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/4948
public class B125 {

    static final int MAX = 123456 * 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(MAX); i++) {
            if (!isPrime[i]) continue;

            for (int j = i * i; j <= MAX; j += i) {
                isPrime[j] = false;
            }
        }

        while (true) {
            int N = Integer.parseInt(br.readLine());

            if (N == 0) break;

            int count = 0;

            for (int i = N + 1; i <= N * 2; i++) {
                if (isPrime[i]) count++;
            }

            System.out.println(count);
        }
    }
}
