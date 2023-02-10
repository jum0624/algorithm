package day6;

import java.util.ArrayList;
import java.util.Stack;

public class OX퀴즈 {
    public int solution(int num, int k) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int tmp = num;

        while (tmp != 0) {
            int oneNum = tmp % 10;
            stack.push(oneNum);
            tmp = tmp / 10;
        }

        for (int i = 0; stack.size() > 0 ; i++) {
            arrayList.add(stack.pop());
        }

        int index = -1;

        if (arrayList.contains(k)) {
            index = arrayList.indexOf(k) + 1;
        }

        answer = index;

        return answer;
    }

    public static void main(String[] args) {
        OX퀴즈 sol = new OX퀴즈();
        System.out.println(sol.solution(123456, 7));
    }
}
