package stack.boj_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        String input = "";
        while (true) {
            input = br.readLine();
            if (input.equals(".")) {
                break;
            }
            String result = "yes";
            Stack<String> stack = new Stack<>();
            String[] split = input.split("");
            for (String s : split
            ) {
                if (s.equals("[") || s.equals("(")) {
                    stack.push(s);
                }
                if (s.equals("]") || s.equals(")")) {
                    if (!stack.isEmpty()) {
                        String pop = stack.pop();

                        if ((s.equals(")") && !pop.equals("(")) || (s.equals("]") && !pop.equals("["))) {
                            result = "no";
                        }
                    } else {
                        result = "no";
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                result = "no";
            }
            System.out.println(result);
        }



    }
}
