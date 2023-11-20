package algorithm_challenge.day15.SWExpert6808;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    static int[] cards = new int[9];  // 케이스별로 순서가 섞인 인영이의 카드

    static int[] ku_cards = new int[9];  // 규영이의 카드
    static boolean[] checked = new boolean[9];
    static int[] index = new int[9];  // 인영이가 가지고 있는 카드들
    static int ku_count = 0;
    static int in_count = 0;
    static int win = 0;
    static int lose = 0;

    static void permutation(int idx) {
        if(idx >= index.length) {
            // 규영이와 인영이의 카드값 각자 비교 후 점수 저장 로직
            for (int i = 0; i < cards.length; i++) {
                if (cards[i] > ku_cards[i]) {
                    in_count += (cards[i] + ku_cards[i]);
                } else if (cards[i] < ku_cards[i]) {
                    ku_count += (cards[i] + ku_cards[i]);
                }
            }

            // 한 케이스에 대한 게임이 끝난 후 승부결과 카운트
            if (in_count > ku_count) {
                lose += 1;
            } else if (in_count < ku_count) {
                win += 1;
            }
            in_count = 0;
            ku_count = 0;
        }
        for (int i = 0; i < index.length; i++) {
            if (checked[i]) continue;
            cards[i] = index[idx];
            checked[i] = true;
            permutation(idx + 1);
            checked[i] = false;
        }
    }

    // 게임에서 이기는 경우 : 숫자가 상대의 것보다 클 경우; 상대숫자 + 내가 낸 카드 숫자만큼 점수 획득
    // 상대의 카드는 고정되어 있는 상태 (상대 카드의 인덱스를 순서대로 돌며, 현재 케이스에 해당하는 카드별로 비교하기)
    // 카드에 숫자를 비교한 후, 크면 이긴걸로, 지거나 비길경우는 모두 0점으로 처리
    // 게임에서 지는 경우 : 점수 0점
    // 비기는 경우는 고려하지 않음

    public static void main(String args[]) throws Exception
    {

//        System.setIn(new FileInputStream("/Users/eunmi/Desktop/s_input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        int[] tmp_card = new int[9];
        for(int test_case = 1; test_case <= T; test_case++)
        {
            for (int i = 0; i < ku_cards.length; i++) {
                tmp_card[i] = sc.nextInt();
            }
            for (int i = 0; i < ku_cards.length; i++) {
                ku_cards[i] = tmp_card[i];
            }


            // 입력 받은 숫자를 제외한 나머지 카드(인영이의 카드)를 받아오기
            int j = 0;
            int k = 0;
            for (int i = 1; i <= 18; i++) {
                Arrays.sort(tmp_card);
                if (j >= 9 || tmp_card[j] != i) {
                    index[k] = i;
                    k += 1;
                } else j += 1;
            }
            permutation(0);  // 순서를 다르게하여 각 케이스를 설정
            // 해당 케이스를 바탕으로 게임을 이기는 수와 지는 경우의 수 구하기 -> 함수로 작성하기
            System.out.println("#" + test_case + " " + win + " " + lose);
            win = 0;
            lose = 0;
        }
    }
}