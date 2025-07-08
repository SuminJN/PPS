import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/6321
public class C046 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();

            System.out.println("String #" + i);

            for (int j = 0; j < str.length(); j++) {
                int temp = ((str.charAt(j) + 1));
                if (temp == 91) temp = 65;
                System.out.print((char)temp);
            }

            System.out.println("\n");
        }
    }
}
