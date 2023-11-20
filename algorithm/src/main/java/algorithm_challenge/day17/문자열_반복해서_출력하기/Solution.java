package algorithm_challenge.day17.문자열_반복해서_출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        System.out.print(str.repeat(n));
    }
}
