package hash.progremmers_포켓몬;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int length = nums.length / 2;
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums
        ) {
            set.add(num);
        }
        int size = set.size();
        answer = size;
        if (size >= length) {
            answer = length;
        }
        return answer;
    }
}