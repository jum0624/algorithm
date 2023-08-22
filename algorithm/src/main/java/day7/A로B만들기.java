package day7;

import java.util.Arrays;

public class A로B만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        String[] split = after.split("");
        String[] split1 = before.split("");

        Arrays.sort(split);
        Arrays.sort(split1);

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(split1[i])) {
                answer = 1;
            } else {
                answer = 0;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        A로B만들기 sol = new A로B만들기();
        System.out.println(sol.solution("olleh", "hello"));
    }

}
