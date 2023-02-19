package day7;

public class 캐릭터의좌표 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int boardX = (board[0] - 1) / 2;
        int boardY = (board[1] - 1) / 2;

        for (String s : keyinput
        ) {
            if (s.equals("left")) {
                answer[0] -= 1;
            } else if (s.equals("right")) {
                answer[0] += 1;
            } else if (s.equals("up")) {
                answer[1] += 1;
            } else if (s.equals("down")) {
                answer[1] -= 1;
            }

            if (Math.abs(answer[0]) >= boardX) {
                if (answer[0] >= boardX) {
                    answer[0] = boardX;
                } else if(answer[0] <= -boardX){
                    answer[0] = -boardX;
                }
            }

            if (Math.abs(answer[1]) >= boardY) {
                if (answer[1] >= boardY) {
                    answer[1] = boardY;
                } else if (answer[1] <= -boardY){
                    answer[1] = -boardY;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        캐릭터의좌표 sol = new 캐릭터의좌표();
        System.out.println(sol.solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9}));
    }

}
