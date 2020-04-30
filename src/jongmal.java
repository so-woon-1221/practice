import java.util.Scanner;

public class jongmal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String six = "666";
        int count = 0;

        for (int i = 665; ; i++){
            String ans = Integer.toString(i);
            if(ans.contains(six)){
                count++;
            }
            if(count == a) {
                System.out.println(ans);
                break;
            }
        }
    }
}
