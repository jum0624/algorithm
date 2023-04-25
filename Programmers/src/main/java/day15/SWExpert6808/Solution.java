package day15.SWExpert6808;

/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;
// double b = 1.0;
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;
import java.util.Scanner;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
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
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
//        System.setIn(new FileInputStream("/Users/eunmi/Desktop/s_input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
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