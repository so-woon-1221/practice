import java.util.Scanner;
import java.util.StringTokenizer;

public class chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        StringTokenizer token = new StringTokenizer(num);
        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());
        String[][] board = new String[a][b];
        int[][] changes = new int[a][b];
        String[] bb = new String[]{"B", "W", "B", "W", "B", "W", "B", "W"};
        String[] ww = new String[]{"W", "B", "W", "B", "W", "B", "W", "B"};
        for (int i = 0; i < a; i++) {
            String bw = sc.nextLine();
            String[] prob = bw.split("");
            for (int j = 0; j < b; j++) {
                board[i][j] = prob[j];
                changes[i][j] = -1;
            }
        }

        for (int i = 0; i <= a - 8; i++) {
            for (int j = 0; j <= b - 8; j++) {
                int change = 0;
                int count = 0;
                if (board[i][j].equals("B")) {
                    int div = i % 2;
                    for (int m = i; m < i + 8; m++) {
                        count = 0;
                        for (int n = j; n < j + 8; n++) {
                            if (m % 2 == div) {
                                if (!bb[count].equals(board[m][n])) {
                                    change++;
                                }
                            } else {
                                if (!ww[count].equals(board[m][n])) {
                                    change++;
                                }
                            }
                            count++;
                        }
                    }
                } else {
                    int div = i % 2;
                    for (int m = i; m < i + 8; m++) {
                        count = 0;
                        for (int n = j; n < j + 8; n++) {
                            if (m % 2 == div) {
                                if (!ww[count].equals(board[m][n])) {
                                    change++;
                                }
                            } else {
                                if (!bb[count].equals(board[m][n])) {
                                    change++;
                                }
                            }
                            count++;
                        }
                    }
                }
                changes[i][j] = change;
            }
        }
        int min = 70;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (changes[i][j] != -1) {
                    if (min >= changes[i][j]) {
                        min = changes[i][j];
                    }
                }
            }
        }
        System.out.println(min);
    }
}
