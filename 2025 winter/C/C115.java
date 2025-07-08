import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/12919
public class C115 {

    static String input, target;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();
        target = br.readLine();

        func(target);

        System.out.println(answer);
    }

    static void func(String str) {
        if (str.equals(input)) {
            answer = 1;
            return;
        }

        if (str.length() == input.length()) {
            return;
        }

        if (str.endsWith("A")) {
            func(str.substring(0, str.length() - 1));
        }

        if (str.startsWith("B")) {
            StringBuilder sb = new StringBuilder(str.substring(1));
            func(sb.reverse().toString());
        }
    }
}
