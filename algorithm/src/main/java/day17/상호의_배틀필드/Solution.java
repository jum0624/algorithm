package day17.상호의_배틀필드;

import java.util.Scanner;

class Solution {

    static char[][] array;
    static char[] skill;
    static int x;
    static int y;
    static int[] dx = {-1, 1, 0, 0};  // 위 아래 오른 왼
    static int[] dy = {0, 0, 1, -1};
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            array = new char[H][W];
            for (int i = 0; i < H; i++) {
                String line = sc.next();
                for (int j = 0; j < W; j++) {
                    array[i][j] = line.charAt(j);
                }
            }

            int num = sc.nextInt();
            skill = new char[num];

            String next = sc.next();
            for (int k = 0; k < num; k++) {
                skill[k] = next.charAt(k);
            }

            // 전차 위치 찾기
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (array[i][j] == '>' || array[i][j] == '<' || array[i][j] == '^' || array[i][j] == 'v') {
                        x = i;
                        y = j;
                    }
                }
            }

            // 동작시(UDLRS)
            for (int i = 0; i < skill.length; i++) {
                int nowX = x;
                int nowY = y;

                if (skill[i] == 'U') {
                    // 방향회전 하고
                    array[x][y] = '^';
                    // next로 진입 가능여부 확인
                    // 이동 (전에 위치 .으로 바꾸고 옮기기)
                    nowX += dx[0];
                    nowY += dy[0];
                    if (nowX >= 0 && array[nowX][nowY] == '.') {
                        array[x][y] = '.';
                        array[nowX][nowY] = '^';
                        // 전차 위치 업데이트
                        x = nowX;
                        y = nowY;
                    }

                } else if (skill[i] == 'D') {
                    array[x][y] = 'v';
                    nowX += dx[1];
                    nowY += dy[1];
                    if (nowX < H && array[nowX][nowY] == '.') {
                        array[x][y] = '.';
                        array[nowX][nowY] = 'v';
                        x = nowX;
                        y = nowY;
                    }

                } else if (skill[i] == 'R') {
                    array[nowX][nowY] = '>';
                    nowX += dx[2];
                    nowY += dy[2];
                    if (nowY < W && array[nowX][nowY] == '.') {
                        array[x][y] = '.';
                        array[nowX][nowY] = '>';
                        x = nowX;
                        y = nowY;
                    }

                } else if (skill[i] == 'L') {
                    array[nowX][nowY] = '<';
                    nowX += dx[3];
                    nowY += dy[3];
                    if (nowY >= 0 && array[nowX][nowY] == '.') {
                        array[x][y] = '.';
                        array[nowX][nowY] = '<';
                        x = nowX;
                        y = nowY;
                    }

                } else if (skill[i] == 'S') {
                    int nextX = nowX;
                    int nextY = nowY;
                    if (array[x][y] == '^') {
                        // 한칸씩 위로 올라가며 목표물 확인
                        // 확인 후 폭파 가능시 .으로 변경
                        // #을 만날 경우 break
                        while(true) {
                            nextX += dx[0];
                            nextY += dy[0];
                            if (nextX >= 0 && array[nextX][nextY] == '*') {
                                array[nextX][nextY] = '.';
                                break;
                            }
                            if (nextX < 0 || array[nextX][nextY] == '#') {
                                break;
                            }
                        }
                    } else if (array[x][y] == 'v') {
                        while(true) {
                            nextX += dx[1];
                            nextY += dy[1];
                            if (nextX < H && array[nextX][nextY] == '*') {
                                array[nextX][nextY] = '.';
                                break;
                            }
                            if (nextX >= H || array[nextX][nextY] == '#') {
                                break;
                            }
                        }

                    } else if (array[x][y] == '>') {
                        while(true) {
                            nextX += dx[2];
                            nextY += dy[2];
                            if (nextY < W && array[nextX][nextY] == '*') {
                                array[nextX][nextY] = '.';
                                break;
                            }
                            if (nextY >= W || array[nextX][nextY] == '#') {
                                break;
                            }
                        }

                    } else if (array[x][y] == '<') {
                        while(true) {
                            nextX += dx[3];
                            nextY += dy[3];
                            if (nextY >= 0 && array[nextX][nextY] == '*') {
                                array[nextX][nextY] = '.';
                                break;
                            }
                            if (nextY < 0 || array[nextX][nextY] == '#') {
                                break;
                            }
                        }
                    }
                }
            }

            System.out.print("#" + test_case + " ");
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }

        }
    }
}