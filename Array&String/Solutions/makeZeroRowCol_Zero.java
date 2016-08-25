package Solutions;

import java.awt.Point;
import java.util.Arrays;
import java.util.Stack;

public class makeZeroRowCol_Zero {
	/*
	 * p93, Q)1.7
	 * travelling MxN array, when zero is detected then make row, col elements which contains zero zero
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 5;
		int n = 4;
		int arr[][] = {
				{1, 2, 4, 2},
				{3, 7, 0, 1},
				{4, 1, 9, 2},
				{0, 2, 1, 2},
				{1, 3, 4, 7}
		};
		
		System.out.println("<before>");
		System.out.println(Arrays.deepToString(arr).replace("],", "]\n"));
		mkZero(arr, m, n);
		System.out.println("<after>");
		System.out.println(Arrays.deepToString(arr).replace("],", "]\n"));
	}
	private static void mkZero(int arr[][], int m, int n){
		Stack<Point> zero_points = new Stack<>();
		
		for(int i = 0;i < m;i++)
			for(int j = 0;j < n;j++)
				if(arr[i][j] == 0)
					zero_points.push(new Point(i, j));
					
		for(Point p : zero_points){
			for(int i = 0;i < m;i++)
				arr[i][p.y] = 0;
			for(int i = 0;i < n;i++)
				arr[p.x][i] = 0;
		}
	}
}
