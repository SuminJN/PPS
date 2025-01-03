import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/1475
public class A017 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] num = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            num[n]++;
        }

        int sum = num[6] + num[9];

        if (sum % 2 == 1) {
            num[6] = sum / 2;
            num[9] = sum / 2 + 1;
        } else {
            num[6] = num[9] = sum / 2;
        }

        int max = Arrays.stream(num).reduce(Math::max).orElse(0);

        System.out.println(max);
    }
}
