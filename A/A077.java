import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/2822
public class A077 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[8][2];
        int[] num = new int[5];
        int sum = 0;

        for (int i = 0; i < 8; i++) {
            arr[i][0] = i + 1;
            arr[i][1] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, (int[] a, int[] b) -> b[1] - a[1]);

        for (int i = 0; i < 5; i++) {
            num[i] = arr[i][0];
            sum += arr[i][1];
        }

        Arrays.sort(num);

        sb.append(sum).append("\n");

        for (int i = 0; i < 5; i++) {
            sb.append(num[i]).append(" ");
        }

        System.out.println(sb);
    }
}
