package 재귀.boj_1074;

import java.util.Scanner;

public class Main {
    static int cnt = 0;
    static int x;
    static int y;
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        int k = (int) Math.pow(2, n);

        draw(n, 0, 0);
    }

    static void draw(int n, int a, int b) {
        int k = (int)Math.pow(2, n);
        if (a == x && b == y) {
            System.out.println(cnt);
        } else if (a <= x && a + k > x && b <= y && b + k > y) {
            int d = (int)Math.pow(2, n-1);
            draw(n - 1, a, b);
            draw(n - 1, a, b + d);
            draw(n - 1, a + d, b);
            draw(n - 1, a + d, b + d);
        } else {
            cnt = cnt + (k * k);
        }
    }
}
