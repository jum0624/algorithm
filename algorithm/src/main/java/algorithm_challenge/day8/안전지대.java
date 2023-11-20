package algorithm_challenge.day8;

public class 안전지대 {

    public int solution(int[][] board) {
        int answer = board.length * board[0].length;
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    count += 1;
                    System.out.println("(" + i + ", " + j + ")");
                    // Up & down
                    if (i - 1 >= 0) {
                        int k = i - 1;  // isUp
                        if (board[k][j] == 0) {
                            count += 1;
                            board[k][j] = 2;
                        }
                        if (j - 1 >= 0) {
                            int l = j - 1;
                            if (board[k][l] == 0) {
                                count += 1;
                                board[k][l] = 2;
                            }
                        }
                        if (j + 1 < board[i].length) {
                            int l = j + 1;
                            if (board[k][l] == 0) {
                                count += 1;
                                board[k][l] = 2;
                            }
                        }

                    }
                    if (i + 1 < board.length) {
                        int k = i + 1;
                        if (board[k][j] == 0) {
                            count += 1;
                            board[k][j] = 2;
                        }
                        if (j - 1 >= 0) {
                            int l = j - 1;
                            if (board[k][l] == 0) {
                                count += 1;
                                board[k][l] = 2;
                            }
                        }
                        if (j + 1 < board[i].length) {
                            int l = j + 1;
                            if (board[k][l] == 0) {
                                count += 1;
                                board[k][l] = 2;
                            }
                        }
                    }
                    // right & left
                    if (j - 1 >= 0) {
                        int k = j - 1;
                        if (board[i][k] == 0) {
                            count += 1;
                            board[i][k] = 2;
                        }
                    }
                    if (j + 1 < board[i].length) {
                        int k = j + 1;
                        if (board[i][k] == 0) {
                            count += 1;
                            board[i][k] = 2;
                        }
                    }
                }
            }
        }
        answer -= count;
        return answer;
    }


    public static void main(String[] args) {
        안전지대 sol = new 안전지대();
        System.out.println(sol.solution(new int[][]{{0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));

    }
}
