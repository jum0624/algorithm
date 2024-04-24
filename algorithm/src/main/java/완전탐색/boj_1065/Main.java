package 완전탐색.boj_1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i >= 100) {
                int n3 = i % 10;
                int k = i / 10;
                int n2 = k % 10;
                k = k / 10;
                int n1 = k % 10;
                int d = n2 - n1;
                int next = n2 + d;
                if (next != n3 || i == 1000) continue;
            }
            result += 1;
        }

        System.out.println(result);
    }
}
