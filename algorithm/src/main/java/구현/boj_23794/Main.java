package 구현.boj_23794;

import java.util.Scanner;

public class Main {

    static String[][] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        map = new String[n + 2][n + 2];
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                map[i][j] = " ";
                if ((i == 0 || i == n + 1) || (j == 0 || j == n + 1)) {
                    map[i][j] = "@";
                }
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
