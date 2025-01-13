import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1159
public class A046 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] alphabet = new int[26];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            alphabet[(int) str.charAt(0) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] >= 5) {
                sb.append((char) (i + 97));
            }
        }

        if (sb.toString().isEmpty()) System.out.println("PREDAJA");
        else System.out.println(sb);
    }
}
