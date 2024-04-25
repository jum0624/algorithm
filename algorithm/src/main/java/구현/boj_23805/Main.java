package 구현.boj_23805;

import java.util.Scanner;

public class Main {

    static String[][] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        map = new String[n * 5][n * 5];
        for (int i = 0; i < n * 5; i++) {
            for (int j = 0; j < n * 5; j++) {
                if (j < n) {
                    map[i][j] = "@";
                }
                else if (j >= 2 * n && j < 3 * n) {
                    map[i][j] = "@";
                }
                else if (j >= 4 * n) {
                    map[i][j] = "@";
                }
            }
        }

        for (int i = 0; i < n * 5; i++) {
            for (int j = 0; j < n * 5; j++) {
                if (i < n && j < 2 * n) {
                    map[i][j] = "@";
                }
                else if (i >= 4 * n && j >= 3 * n) {
                    map[i][j] = "@";
                }
            }
        }

        for (int i = 0; i < n * 5; i++) {
            for (int j = 0; j < n * 5; j++) {
                if (map[i][j] != null) {
                    System.out.print(map[i][j]);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
