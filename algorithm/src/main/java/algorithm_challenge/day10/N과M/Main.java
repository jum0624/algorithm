package algorithm_challenge.day10.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] numbers;
    public static int[] index;
    public static boolean[] checked;   // 중복선택이 되지 않도록 선택된 숫자는 checked

    public static void main(String[] args) throws IOException {
        // Enter로 구분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 띄어쓰기 구분
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        numbers = new int[n];
        index = new int[r];
        checked = new boolean[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            checked[i] = false;
        }

        for (int i = 0; i < index.length; i++) {
            index[i] = 0;
        }

        param(0);

    }

    public static void param(int idx) {
        if (idx >= index.length) {
            for (int i : index
            ) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < numbers.length; i++) {  // 모든 일꾼들은 n개의 숫자를 선택할 수 있음
            if (checked[i]) continue;  // 이미 선택한 숫자인 경우는 그냥 넘어가기(중복 발생 방지)
            index[idx] = numbers[i];  // 일꾼이 숫자를 선택하지 않은 경우 n개 중 i번째 숫자 선택
            checked[i] = true;  // 일꾼이 선택한 숫자 check
            param(idx + 1);  // 다음 일꾼에게 숫자를 선택하도록 넘기기
            checked[i] = false;  // 선택했던 숫자의 모든 경우의 수를 구한 뒤, 다른 숫자를 선택하기 위해 check 해제
        }
    }
}
