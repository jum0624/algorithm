package brute_force.분해합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            int next_point = i;
            int sum = i;
            while (next_point / 10 != 0) {
                int one_point = next_point % 10;
                next_point = next_point / 10;
                sum += one_point;
            }
            sum += next_point;
            if (sum == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
