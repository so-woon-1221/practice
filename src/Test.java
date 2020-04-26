import java.util.Scanner;

public class Test {
    int d(int n) {
       int ans = n;
       int num_length = (int)Math.log10(n)+1;
       for(int i =0;i<num_length;i++){
           ans += n%10;
           if(n>=10)
               n = n/10;
       }
       return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Test newTest = new Test();
        int[] num_array = new int[10000];
        for (int i=0; i<10000; i++){
            num_array[i]=newTest.d(i);
        }
        for (int i=0; i<10000;i++){
            int count=0;
            for (int j=0; j<10000;j++){
                if(i==num_array[j]){
                    count++;
                    break;
                }
            }
            if (count==0)
                System.out.println(i);
        }
    }
}
