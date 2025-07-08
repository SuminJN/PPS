import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10162
public class B033 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N % 10 != 0) {
            System.out.println(-1);
            return;
        }

        int[] count = new int[3];

        if (N / 300 > 0) {
            count[0] += (N / 300);
            N %= 300;
        }

        if (N / 60 > 0) {
            count[1] += (N / 60);
            N %= 60;
        }

        count[2] += (N / 10);

        System.out.println(count[0] + " " + count[1] + " " + count[2]);
    }
}
