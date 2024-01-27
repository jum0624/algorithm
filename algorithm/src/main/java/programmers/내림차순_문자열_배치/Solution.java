package programmers.내림차순_문자열_배치;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        Integer[] charList = new Integer[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            int c = charArray[i];
            charList[i] = c;
        }
        Arrays.sort(charList, Collections.reverseOrder());
        for (Integer num : charList
        ) {
            char ch = (char) num.intValue();
            answer += ch;
        }
        return answer;
    }
}
