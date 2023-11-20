package algorithm_challenge.day8;

public class 평행 {
    public int solution(int[][] dots) {
        int answer = 0;

        if (value(dots, 0, 1) == value(dots, 2, 3)) {
            answer = 1;
        } else if (value(dots, 0, 2) == value(dots, 1, 3)) {
            answer = 1;
        } else if (value(dots, 0, 3) == value(dots, 1, 2)) {
            answer = 1;
        }
        return answer;
    }

    public double value(int[][] dots, int i, int j) {
        double changedX = dots[i][0] - dots[j][0];
        double changedY = dots[i][1] - dots[j][1];
        double changed = changedY / changedX;
        return changed;

    }
    public static void main(String[] args) {
        평행 sol = new 평행();
        System.out.println(sol.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
        System.out.println(sol.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}));
    }
}
