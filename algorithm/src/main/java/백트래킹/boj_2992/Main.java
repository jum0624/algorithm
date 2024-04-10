package 백트래킹.boj_2992;

import java.io.*;
import java.util.*;

public class Main {
	static int[] index;
	static int[] choice;
	static boolean[] visited;
	static int target;
	static int len;
	
	static int min;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		target = n;
		int k = 10;
		len = 1;
		while(n / k != 0) {
			k *= 10;
			len += 1;
		}
		
		index = new int[len];
		choice = new int[len];
		visited = new boolean[len];
		k = k / 10;
		for(int i=0;i<len;i++) {
			int num = n / k;
			index[i] = num;
			n = n - (num * k);
			k = k / 10;
		}
		
		min = 1000000;
		comb(0);
		if(min == 1000000) {
			min = 0;
		}
		System.out.print(min);
		
	}
	
	static void comb(int idx) {
		if(idx == len) {
			int num = makeNumber();
			if(num > target) {
				min = Math.min(min, num);
			}
			return;
		}
		for(int i=0;i<len;i++) {
			if(!visited[i]) {
				visited[i] = true;
				choice[idx] = index[i];
				comb(idx + 1);
				visited[i] = false;
			}
		}
	}
	
	static int makeNumber() {
		int result = 0;
		for(int i=0;i<choice.length;i++) {
			result += choice[i];
			result *= 10;
		}
		return result / 10;
	}

}
