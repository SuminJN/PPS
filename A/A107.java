import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1292
public class A107 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] arr = new int[B + 1];

        int count = 0, now = 1;

        for (int i = 1; i <= B; i++) { // arr = [1, 2, 2, 3, 3, 3, ...]
            arr[i] = now;
            count++;

            if (count == now) {
                count = 0;
                now++;
            }
        }

        int sum = 0;

        for (int i = A; i <= B; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
