import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5355
public class A035 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double num = Double.parseDouble(st.nextToken());

            while (st.hasMoreTokens()) {
                String c = st.nextToken();

                if (c.equals("@")) {
                    num *= 3;
                } else if (c.equals("%")) {
                    num += 5;
                } else {
                    num -= 7;
                }
            }

            System.out.printf("%.2f%n", num);

            t--;
        }
    }
}
