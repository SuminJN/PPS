import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/5598
public class A050 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int a = ((int) str.charAt(i)) - 3;
            if (a < 65) a += 26;
            sb.append((char) a);
        }

        System.out.println(sb);
    }
}
