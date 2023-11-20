package algorithm_challenge.ssafy.swea1926;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            String result = "";
            char[] charArray = s.toCharArray();
            for (char c : charArray
            ) {
                if (c == '3' || c == '6' || c == '9') {
                    result += "-";
                }
            }
            if (result == "") {
                result = s;
            }
            System.out.print(result + " ");
        }
    }
}
