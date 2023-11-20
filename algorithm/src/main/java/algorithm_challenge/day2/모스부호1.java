package algorithm_challenge.day2;

import java.util.HashMap;
import java.util.Map;

public class 모스부호1 {
    public String solution(String letter) {
        String answer = "";
        String[] split = letter.split(" ");
        Map<String, String> map = new HashMap<>() {{
            put(".-", "a");
            put("-...","b");
            put("-.-.","c");
            put("-..","d");
            put(".", "e");
            put("..-.","f");
            put("--.","g");
            put("....","h");
            put("..","i");
            put( ".---","j");
            put("-.-","k");
            put(".-..","l");
            put("--","m");
            put("-.","n");
            put("---","o");
            put(".--.","p");
            put("--.-","q");
            put(".-.","r");
            put("...","s");
            put("-","t");
            put("..-","u");
            put("...-","v");
            put(".--","w");
            put("-..-","x");
            put("-.--","y");
            put("--..","z");
        }};

        for (int i = 0; i < split.length; i++) {
            for (String key : map.keySet()) {
                if (key.equals(split[i])) {
                    answer += map.get(key);
                }
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        모스부호1 sol = new 모스부호1();
        System.out.println(sol.solution(".--. -.-- - .... --- -."));
    }
}
