package day17.재귀함수가_뭔가요;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int i = 0;
    static String str = "";
    static String q = "\"재귀함수가 뭔가요?\"";
    static String a1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static String a2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static String a3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    static String a4 = "라고 답변하였지.";

     public static void rotate(int k) {
         int j = i;
         String a = str + q;
         String b = str + a1;
         String c = str + a2;
         String d = str + a3;
         String e = str + a4;
         System.out.println(a);
         if (j != k) {
             System.out.println(b);
             System.out.println(c);
             System.out.println(d);
             i += 1;
             str += "____";
             rotate(k);
        }
         if (j == k) {
             String a2 = str + "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
             System.out.println(a2);
         }
        System.out.println(e);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int k = Integer.parseInt(s);

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        rotate(k);
    }
}
