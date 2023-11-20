package algorithm_challenge.day6;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int x = 0;
        int y = 0;
        int z = 0;
        int result = 0;
        int i = 0;

        for (String s : quiz
        ) {
            String[] split = s.split(" ");
            x = Integer.parseInt(split[0]);
            y = Integer.parseInt(split[2]);
            z = Integer.parseInt(split[4]);
            if (split[1].equals("+")) {
                result = x + y;
            } else if (split[1].equals("-")) {
                result = x - y;
            }
            if (result == z) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
            i += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        OX퀴즈 sol = new OX퀴즈();
        String[] solution = sol.solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
        for (String s : solution
        ) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
