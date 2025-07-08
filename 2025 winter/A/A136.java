import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1543
public class A136 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String target = br.readLine();

        int count = 0;

        input = input.replaceAll(target, "#");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '#') count++;
        }

        System.out.println(count);
    }
}
