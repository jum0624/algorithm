package day10;

public class 겹치는선분의길이 {
    public int solution(int[][] lines) {
        int answer = 0;
        int min = 101;
        int max = -101;
        int[] store = new int[200];

        for (int i = 0; i < store.length; i++) {
            store[i] = 0;
        }

        for (int i = 0; i < lines.length; i++) {
            min = lines[i][0];
            max = lines[i][1];
            for (int j = 100 + min; j < 100 + max ; j++) {
                if (store[j] == 0) {
                    store[j] = 1;
                } else if (store[j] == 1) {
                    store[j] = 2;
                }
            }
        }

        for (int i = 0; i < store.length; i++) {
            if (store[i] == 2) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        겹치는선분의길이 sol = new 겹치는선분의길이();
//        System.out.println(sol.solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(sol.solution(new int[][]{{0, 5},{3, 9},{1, 10}}));
    }
}
