import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/6571
public class C037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            BigInteger N = new BigInteger(st.nextToken());
            BigInteger M = new BigInteger(st.nextToken());

            if (N.toString().equals("0") && M.toString().equals("0")) break;

            int count = 0;

            BigInteger num1 = BigInteger.ONE;
            BigInteger num2 = BigInteger.TWO;
            BigInteger num3;

            if (num1.compareTo(N) >= 0 && num1.compareTo(M) <= 0) count++;
            if (num2.compareTo(N) >= 0 && num2.compareTo(M) <= 0) count++;

            while (true) {
                num3 = num1.add(num2);

                if (num3.compareTo(N) >= 0 && num3.compareTo(M) <= 0) {
                    count++;
                } else if (num3.compareTo(M) > 0) {
                    break;
                }

                num1 = num2;
                num2 = num3;
            }

            System.out.println(count);
        }
    }
}
