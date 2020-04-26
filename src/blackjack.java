import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int cha = m;
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(m-(num[i]+num[j]+num[k])<=cha && m-(num[i]+num[j]+num[k])>=0){
                        cha = m-(num[i]+num[j]+num[k]);
                        ans = num[i]+num[j]+num[k];
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
