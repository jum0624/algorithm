package day8;

public class 다항식더하기 {
    public String solution(String polynomial) {
        String answer = "";
        int k = 0;
        int count = 0;
        String[] split = polynomial.split(" ");
        for (int i = 0; i < split.length; i = i + 2) {
            if (split[i].contains("x")) {
                String[] strings = split[i].split("x");
                if (strings.length == 0) {
                    count += 1;
                }
                for (String str : strings
                ) {
                    if (!str.equals("x")) {
                        count += Integer.parseInt(str);
                    }
                }
            } else {
                k += Integer.parseInt(split[i]);
            }
        }

        /**
         * x 만 존재할 때, x + k모두 존재시, k만 존재시
         */
        if (count != 0) {
            if (count == 1) {
                answer += "x";
            } else {
                answer += count + "x";
            }
            if (k != 0) {
                answer += " + " + k;
            }
        } else {
            answer += k;
        }
        return answer;
    }

    public static void main(String[] args) {
        다항식더하기 sol = new 다항식더하기();
        System.out.println(sol.solution("10x + 1"));
        String s = "x";
        String[] xes = s.split("x");
        System.out.println("xes.length = " + xes.length);
    }

}
