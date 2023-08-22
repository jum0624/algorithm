package day17.대소문자_바꿔서_출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}
