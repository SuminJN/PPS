import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3059
public class A106 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            boolean[] alphabet = new boolean[26];

            String str = br.readLine();

            for (char c : str.toCharArray()) {
                int i = c - 'A';
                alphabet[i] = true;
            }

            int sum = 0;

            for (int i = 0; i < 26; i++) {
                if (!alphabet[i]) {
                    sum += i + 65;
                }
            }

            System.out.println(sum);
        }
    }
}
