import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prob = sc.nextInt();
        Main main = new Main();
        String[][] ans = main.func(prob);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ans[i][j]);
            }
        }
    }

    String[][] func(int a) {
        if(a==3){
            String[][] nemo = new String[3][3];
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(i==1&&j==1){
                        nemo[i][j]=" ";
                    }else
                        nemo[i][j]="*";
                }

            }
            return nemo;
        }else{
            String[][] nemo = func(a/3);
            String ans = nemo.toString();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    ans+=nemo[i][j];
                }
                ans+="\n";
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(i==1&&j==1){
                        String ans2="";
                        for(int m=0;m<a;m++){
                            for(int n=0;n<a;n++){
                                ans2+=" ";
                            }
                            ans2+="\n";
                        }
                        nemo[i][j]=ans2;
                    }
                    else{
                        nemo[i][j]=ans;
                    }
                }
            }
            return nemo;
        }
    }
}