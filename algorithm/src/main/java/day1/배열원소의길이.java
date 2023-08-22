package day1;

import java.util.Arrays;

public class 배열원소의길이 {

    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        배열원소의길이 sol = new 배열원소의길이();
        int[] result = sol.solution(new String[]{"We", "are", "the", "world!"});
        System.out.println(Arrays.toString(result));
    }
}
