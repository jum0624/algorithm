package algorithm_challenge.day7;

public class k의개수_7 {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String s = String.valueOf(array[i]);
            String[] split = s.split("");
            for (int j = 0; j < split.length; j++) {
                if (split[j].contains("7")) {
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        k의개수_7 sol = new k의개수_7();
        System.out.println(sol.solution(new int[]{7, 77, 17}));

    }
}
