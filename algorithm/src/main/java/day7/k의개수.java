package day7;

public class k의개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String toStringK = String.valueOf(k);
        for (int l = i; l <= j; l++) {
            String s = String.valueOf(l);
            String[] strings = s.split("");
            for (int m = 0; m < strings.length; m++) {
                if (strings[m].contains(toStringK)) {
                    answer += 1;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        k의개수 sol = new k의개수();
        System.out.println(sol.solution(1, 13, 1));
    }
}
