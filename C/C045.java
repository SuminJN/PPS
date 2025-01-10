import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/15947
public class C045 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()) - 1;

        String[] str = new String[14];

        str[0] = "baby"; str[1] = "sukhwan"; str[2] = "tururu"; str[3] = "turu";
        str[4] = "very"; str[5] = "cute"; str[6] = "tururu"; str[7] = "turu";
        str[8] = "in"; str[9] = "bed"; str[10] = "tururu"; str[11] = "turu";
        str[12] = "baby"; str[13] = "sukhwan";

        int temp = N / 14;
        N %= 14;

        StringBuilder sb = new StringBuilder(str[N]);
        if (sb.toString().contains("tu")) {
            sb.append("ru".repeat(Math.max(0, temp)));
        }

        String result = sb.toString();

        int count = 0;

        if (result.contains("rururururu")) {

            while (true) {
                if (!result.contains("ru")) break;
                result = result.substring(0, result.length() - 2);
                count++;
            }
        }

        if(count == 0) System.out.println(result);
        else System.out.println(result + "+ru*" + count);
    }
}
