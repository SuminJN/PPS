import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2920
public class A007 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String asc = "1 2 3 4 5 6 7 8";
        String desc = "8 7 6 5 4 3 2 1";

        if (input.equals(asc)) System.out.println("ascending");
        else if (input.equals(desc)) System.out.println("descending");
        else System.out.println("mixed");
    }
}
