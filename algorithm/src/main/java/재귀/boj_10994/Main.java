package 재귀.boj_10994;

import java.io.*;
import java.util.*;

public class Main {
	static String[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int an = (4*n) - 3;
		map = new String[an][an];
		
		drawStar(n, 0, 0);
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map.length;j++) {
				if(map[i][j] == null) map[i][j] = " ";
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
	}
	
	static void drawStar(int n, int x, int y) {
		if(n == 0) return;
		int k = (4*n) - 3;
		
		for(int i=x;i<x+k;i++) {
			map[x][i] = "*";
			map[x + k - 1][i] = "*";
			map[i][y] = "*";
			map[i][y + k - 1] = "*";
		}
		
		drawStar(n-1, x+2, y+2);
	}

}
