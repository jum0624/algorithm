package day8;

import java.util.Arrays;

public class Test {
    public int combination(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            return combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }

    public void comb(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            System.out.println(Arrays.toString(arr) + " " + Arrays.toString(visited));
            System.out.println(n + " " + r);
            return;
        } else {
            for (int i = start; i < n; i++) {
                visited[i] = true;
                comb(arr, visited, i + 1, n, r - 1);
                visited[i] = false;
            }
        }
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        int combination = test.combination(5, 2);
        System.out.println("combination = " + combination);

        int factorial = test.factorial(3);
        System.out.println("factorial = " + factorial);

        test.comb(new int[]{1, 2, 3}, new boolean[]{false, false, false}, 0, 3, 2);
    }
}
