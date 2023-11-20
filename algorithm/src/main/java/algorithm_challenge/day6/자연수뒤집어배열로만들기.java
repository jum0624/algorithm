package algorithm_challenge.day6;

import java.util.ArrayList;

public class 자연수뒤집어배열로만들기 {
    public ArrayList<Long> solution(long n) {
        ArrayList<Long> arrayList = new ArrayList<>();
        long num = n;
        while (num > 0) {
            long number = num % 10;
            arrayList.add(number);
            num /= 10;
        }

        return arrayList;
    }

}
