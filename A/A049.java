import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/4659
public class A049 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals("end")) break;

            char[] chars = str.toCharArray();

            boolean isAcceptable = false;
            char prev = '*';
            int count = 0;

            for (char c : chars) {

                if (isVowel(c)) isAcceptable = true;

                if (isVowel(prev) == isVowel(c)) count++;
                else count = 1;

                if (count > 2 || (prev == c && c != 'e' && c != 'o')) {
                    isAcceptable = false;
                    break;
                }

                prev = c;
            }

            if (isAcceptable) sb.append("<").append(str).append("> is acceptable.\n");
            else sb.append("<").append(str).append("> is not acceptable.\n");
        }

        System.out.println(sb);
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
