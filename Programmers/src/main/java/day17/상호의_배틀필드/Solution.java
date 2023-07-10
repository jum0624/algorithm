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
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
//        System.setIn(new FileInputStream("res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
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
                char state = array[x][y];

                if (skill[i] == 'U') {
                    array[nowX][nowY] = '.';state = '^';
                    nowX += dx[0];
                    nowY += dy[0];
                } else if (skill[i] == 'D') {
                    array[nowX][nowY] = '.';
                    state = 'v';
                    nowX += dx[1];
                    nowY += dy[1];
                } else if (skill[i] == 'L') {
                    array[nowX][nowY] = '.';
                    state = '<';
                    nowX += dx[3];
                    nowY += dy[3];
                } else if (skill[i] == 'R') {
                    array[nowX][nowY] = '.';
                    state = '>';
                    nowX += dx[2];
                    nowY += dy[2];
                } else if (skill[i] == 'S') {
                    int realX = nowX;
                    int realY = nowY;
                    if (array[nowX][nowY] == '^') {
                        while (nowX > 0) {
                            nowX += dx[0];
                            nowY += dy[0];
                            if (array[nowX][nowY] != '#' && array[nowX][nowY] != '-') {
                                array[nowX][nowY] = '.';
                            }
                        }
                    }
                    if (array[nowX][nowY] == 'v') {
                        while (nowX < H-1) {
                            nowX += dx[1];
                            nowY += dy[1];
                            if (array[nowX][nowY] != '#' && array[nowX][nowY] != '-') {
                                array[nowX][nowY] = '.';
                            }
                        }
                    }
                    if (array[nowX][nowY] == '<') {
                        while (nowY > 0) {
                            nowX += dx[3];
                            nowY += dy[3];
                            if (array[nowX][nowY] != '#' && array[nowX][nowY] != '-') {
                                array[nowX][nowY] = '.';
                            }
                        }
                    }
                    if (array[nowX][nowY] == '>') {
                        while (nowY < W-1) {
                            nowX += dx[2];
                            nowY += dy[2];
                            if (array[nowX][nowY] != '#' && array[nowX][nowY] != '-') {
                                array[nowX][nowY] = '.';
                            }
                        }
                    }
                    nowX = realX;
                    nowY = realY;
                }
                if (nowX >= 0 && nowX < H && nowY >= 0 && nowY < W && array[nowX][nowY] != '*' && array[nowX][nowY] != '#' && array[nowX][nowY] != '-') {
                    x = nowX;
                    y = nowY;
                }
                array[x][y] = state;

                for (int p = 0; p < H; p++) {
                    for (int j = 0; j < W; j++) {
                        System.out.print(array[p][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }

        }
    }
}