import java.util.Scanner;

public class bunhaehap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        if (n < 11)
            System.out.println("0");
        else {
            for (int i = 10; i <= n - 1; i++) {
                int ans = i;
                int temp = i;
                int a = (int) Math.log10(i);
                for (int j = 0; j <= a; j++) {
                    ans += temp % 10;
                    temp /= 10;
                }
                if (ans == n) {
                    count++;
                    System.out.println(i);
                    break;
                }
            }
            if(count==0)
                System.out.println(0);
        }
    }
}
