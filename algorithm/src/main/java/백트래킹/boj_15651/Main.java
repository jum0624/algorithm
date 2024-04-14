package 백트래킹.boj_15651;

import java.util.Scanner;

public class Main {

    static int[] choice;
    static int m;
    static int n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        choice = new int[n];

        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int idx) {
        if (idx == n) {
            for (int num : choice
            ) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= m; i++) {
            choice[idx] = i;
            dfs(idx + 1);
        }
    }
}
