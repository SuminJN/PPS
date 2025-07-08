import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1316
public class A048 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int answer = 0;

        while (T-- > 0) {
            String str = br.readLine();
            int[] count = new int[26];
            char prev = str.charAt(0);
            count[(int) prev - 'a']++;

            boolean flag = true;

            for (int i = 1; i < str.length(); i++) {
                char c = str.charAt(i);
                int temp = (int) c - 'a';

                if (prev != c && count[temp] != 0) flag = false;

                count[temp]++;
                prev = c;
            }

            answer += flag ? 1 : 0;
        }

        System.out.println(answer);
    }
}