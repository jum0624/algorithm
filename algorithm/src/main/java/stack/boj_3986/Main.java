package stack.boj_3986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int test_case = 1; test_case <= n; test_case++) {
            String str = br.readLine();
            String[] split = str.split("");

            Stack<String> stack = new Stack<>();
            for (int i = 0; i < split.length; i++) {
                if (!stack.isEmpty()) {
                    String peek = stack.peek();
                    if (peek.equals(split[i])) {
                        stack.pop();
                        continue;
                    }
                }
                stack.push(split[i]);
            }

            if (stack.isEmpty()) {
                cnt += 1;
            }
        }

        System.out.println(cnt);

    }
}
