package day2;

import java.util.Scanner;

public class 직각삼각형출력하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; i >= j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
