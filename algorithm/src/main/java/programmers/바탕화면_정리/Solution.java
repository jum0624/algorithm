package programmers.바탕화면_정리;

public class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        String[][] map = new String[wallpaper.length][wallpaper[0].length()];
        int lux = 999;
        int luy = 999;
        int rdx = -1;
        int rdy = -1;

        for (int i = 0; i < map.length; i++) {
            String[] split = wallpaper[i].split("");
            for (int j = 0; j < split.length; j++) {
                map[i][j] = split[j];
                if (map[i][j].equals("#")) {
                    lux = Math.min(i, lux);
                    rdx = Math.max(i + 1, rdx);
                    luy = Math.min(j, luy);
                    rdy = Math.max(j + 1, rdy);
                }
            }
        }

        answer = new int[]{lux, luy, rdx, rdy};
        return answer;
    }
}
