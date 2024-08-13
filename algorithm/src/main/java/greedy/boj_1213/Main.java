package greedy.boj_1213;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // 영어를 카운트 한다
        int[] index = new int[26];
        for (int i = 0; i < input.length(); i++) {
            int c = input.charAt(i);
            index[c - 65] += 1;
        }

        // 알파벳 문자열의 갯수가 짝수개라면 모두 짝수개
        int count = 0; // 홀수가 몇개일까 ??
        char mid = ' ';
        for (int i = 0; i < index.length; i++) {
            if (index[i] % 2 != 0) {
                count += 1;
                mid = (char) (i + 65);
            }
            index[i] = index[i] / 2;
        }

        if (count > 1) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            String result = "";
            for (int i = 0; i < index.length; i++) {
                while (index[i] != 0) {
                    result += (char) (i + 65);
                    index[i] -= 1;
                }
            }
            String tmp = result;
            if (mid != ' ') {
                result += mid;
            }

            // 반대쪽도 정렬
            for (int i = tmp.length() - 1; i >= 0; i--) {
                result += tmp.charAt(i);
            }

            System.out.println(result);
        }

    }
}
