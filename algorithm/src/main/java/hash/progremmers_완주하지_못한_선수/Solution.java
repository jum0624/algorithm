package hash.progremmers_완주하지_못한_선수;

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String name: participant) {
            if(!map.containsKey(name)) {
                map.put(name, 1);
            }
            else map.put(name, map.get(name) + 1);
        }

        for(String name: completion) {
            Integer cnt = map.get(name);
            map.put(name, cnt - 1);
            if(map.get(name) == 0) map.remove(name);
        }
        for(String name: map.keySet()) {
            answer = name;
        }
        return answer;
    }
}
