package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 최빈값구하기 {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> store = new ArrayList<>();
        int count = 1;

        // 모든 값들 갯수 카운트
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                Integer value = map.get(array[i]);
                map.put(array[i], value + 1);
            } else {
                map.put(array[i], count);
            }
        }

        // 최빈값 구하기
        Integer max_value = Collections.max(map.values());
        int max_key = 0;
        for (Integer key:map.keySet()) {
            if (map.get(key) == max_value) {
                store.add(key);
                max_key = key;
            }
            if (store.size() > 1) {
                return -1;
            }
        }
        return max_key;
    }

    public static void main(String[] args) {
        최빈값구하기 sol = new 최빈값구하기();
        System.out.println(sol.solution(new int[]{1, 2, 3, 3, 3, 4}));
    }
}
