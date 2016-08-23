package Solutions;

import java.util.Scanner;

public class ReverseString {
	/*
	 * 92p, Q)1.2
	 * return reverse the string which is ended with null(\o)
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string which you want to reverse : ");
		
		Scanner scan = new Scanner(System.in);
		System.out.println(reverseString(scan.next()));
		scan.close();
	}
	private static String reverseString(String str){
		String result = new String();
		for(int i = str.length() - 1;i >= 0;i--)
			result += str.charAt(i);
		return result;
	}
}
