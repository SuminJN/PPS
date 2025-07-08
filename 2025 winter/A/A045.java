import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1157
public class A045 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toLowerCase();

        int[] count = new int[26];

        for (char c : str.toCharArray()) {
            count[(int) c - 'a']++;
        }

        int max = 0;
        char target = 'a';

        for (int i = 0; i < 26; i++) {
            if (max < count[i]) {
                max = count[i];
                target = (char) (i + 65);
            }
        }

        int temp = 0;

        for (int i : count) {
            if (i == max) temp++;
        }

        if (temp >= 2) System.out.println("?");
        else System.out.println(target);
    }
}
