package algorithm_challenge.day8;

public class 외계어사전 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (String s : dic
        ) {
            int count = 0;
            for (int i = 0; i < spell.length; i++) {
                if (s.contains(spell[i]) || countChar(s, spell[i]) == 1) {
                    count += 1;
                }
            }
            if (count == spell.length) {
                answer = 1;
            }
        }
        return answer;
    }

    public int countChar(String s, String ch) {
        return s.length() - s.replace(ch, "").length();
    }
    public static void main(String[] args) {
        외계어사전 sol = new 외계어사전();
        System.out.println(sol.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(sol.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        String s = "hi";
        System.out.println(s.contains("i"));
//        System.out.println(sol.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
    }
}
