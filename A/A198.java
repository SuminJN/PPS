import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14627
public class A198 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); // 사온 파 개수
        int C = Integer.parseInt(st.nextToken()); // 팔아야 할 치킨 개수

        int[] chickens = new int[S];

        for (int i = 0; i < S; i++) {
            chickens[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(chickens);

        int start = 1;
        int end = 1000000000;
        int target = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            int count = 0;

            for (int chicken : chickens) {
                count += chicken / mid;
            }

            if (count >= C) {
                target = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        long sum = 0;

        for (int chicken : chickens) {
            sum += chicken;
        }

        sum -= (long) target * C;
        System.out.println(sum);
    }
}
