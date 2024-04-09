package 재귀.boj_16505;

import java.util.*;
import java.io.*;

public class Main {
	
	static String[][] map;
	static int n;
	static int k;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		k = (int)Math.pow(2, n);
		map = new String[k][k];
		
		drawStar(n, 0, 0);
		
		for(int i=0;i<k;i++) {
			for(int j=0;j<k - i;j++) {
				if(map[i][j] == null) map[i][j] = " ";
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
	}
	
	static void drawStar(int n, int x, int y) {
		if(n == 0) {
			map[x][y] = "*";
			return;
		}
		
		int d = (int)Math.pow(2, n-1);
		drawStar(n-1, x, y);
		drawStar(n-1, x + d, y);
		drawStar(n-1, x, y + d);
		
	}

}
