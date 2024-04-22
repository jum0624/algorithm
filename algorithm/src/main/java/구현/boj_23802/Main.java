package 구현.boj_23802;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] map = new String[n * 5][n * 5];
        for (int i = 0; i < n * 5; i++) {
            for (int j = 0; j < n * 5; j++) {
                if (i < n || j < n) {
                    map[i][j] = "@";
                }

            }
        }

        for (int i = 0; i < n * 5; i++) {
            for (int j = 0; j < n * 5; j++) {
                if (map[i][j] != null) {
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
    }
}
