import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
    static String ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Test test = new Test();
        ans = Integer.toString((int) (Math.pow(2,n)-1)) + "\n";
        test.hanoi(n, 1, 2, 3);
        System.out.println(ans);
    }

    void hanoi(int n, int start, int via, int end) {
        if (n == 1) {
            ans += start + " " + end + "\n";
        } else {
            hanoi(n - 1, start, end, via);
            ans += start + " " + end + "\n";
            hanoi(n - 1, via, start, end);
        }
    }
}
