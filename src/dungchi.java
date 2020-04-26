import java.util.Scanner;

public class dungchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] people = new int[n][2];
        int[] count = new int[n];
        for (int i=0;i<n;i++){
            people[i][0] = sc.nextInt();
            people[i][1] = sc.nextInt();
            count[i] = 0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(people[i][0]<people[j][0] && i!=j && people[i][1]<people[j][1])
                    count[i]++;
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(count[i]+1+" ");
    }
}
