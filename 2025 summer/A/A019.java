import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2577
public class A019 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long temp = 1L;

        for(int i = 0; i < 3; i++) {
            temp *= Integer.parseInt(br.readLine());
        }

        int[] num = new int[10];

        String str = String.valueOf(temp);

        for(char c : str.toCharArray()) {
            num[(int)c - '0']++;
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }
    }
}
