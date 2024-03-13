package hash.boj_16165;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());  // 퀴즈 갯수

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String group = st.nextToken();
            st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            for (int j = 0; j < count; j++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                map.put(name, group);
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            st = new StringTokenizer(br.readLine());
            int quiz = Integer.parseInt(st.nextToken());

            if (quiz == 0) {  // 멤버이름 정렬하기
                List<String> list = new ArrayList<>();
                for (String str : map.keySet()
                ) {
                    if (map.get(str).equals(name)) {
                        list.add(str);
                    }
                }
                Collections.sort(list);
                for (String result : list
                ) {
                    System.out.println(result);
                }
            }

            if (quiz == 1) {
                for (String str : map.keySet()
                ) {
                    if (str.equals(name)) {
                        System.out.println(map.get(name));
                    }
                }
            }


        }
    }
}
