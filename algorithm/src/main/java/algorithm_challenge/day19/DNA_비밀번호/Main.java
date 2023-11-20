package algorithm_challenge.day19.DNA_비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static HashMap<Character, Integer> dic = new HashMap<>() {{
        put('A', 0);
        put('C', 0);
        put('G', 0);
        put('T', 0);
    }};
    static HashMap<Character, Integer> dic_result = new HashMap<>() {{
        put('A', 0);
        put('C', 0);
        put('G', 0);
        put('T', 0);
    }};
    static ArrayList<Character> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String dna = st.nextToken();
        for (int i = 0; i < s; i++) {
            list.add(dna.charAt(i));
        }

        char[] dna_set = new char[] {'A', 'C', 'G', 'T'};
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            Integer value = dic_result.get(dna_set[i]);
            value += Integer.parseInt(st.nextToken());
            dic_result.put(dna_set[i], value);
        }

        // 첫번째 탐색 구간 초기화
        for (int i = 0; i < p; i++) {
            Character ch = list.get(i);
            Integer count = dic.get(ch);
            count += 1;
            dic.put(ch, count);
        }


        if (isFull()) result += 1;

        int start = 0;
        // 시작과 끝 지점 값만 조절해가며 탐색
        for (int i = p; i < s; i++) {
            int end = i;
            Character ch_start = list.get(start);
            Integer count_start = dic.get(ch_start);

            // 앞에 문자열 개수 -
            dic.put(ch_start, count_start - 1);

            Character ch_end = list.get(end);
            Integer count_end = dic.get(ch_end);
            // 뒤에 문자열 개수 +
            dic.put(ch_end, count_end + 1);
            if(isFull()) result += 1;
            start += 1;
        }

        System.out.println(result);

    }

    private static boolean isFull() {
        boolean check = true;
        for (Character c : dic.keySet()
        ) {
            Integer count = dic.get(c);
            if (count < dic_result.get(c)) {
                check = false;
            }
        }
        return check;
    }
}
