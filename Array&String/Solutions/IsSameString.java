package Solutions;

import java.util.Scanner;

public class IsSameString {
	/*
	 * 92p, Q)1.3
	 * with 2 strings, return the result whether string1 is different string2 in character ordering 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String test;
		String target;
		
		System.out.println("enter the string which is string1");
		test = scan.next();
		System.out.println("enter the string which is string2");
		target = scan.next();
		scan.close();
		System.out.printf("String \'%s\' and String \'%s\' is%ssame\n", test, target, isSameString(test, target)?" ":" not ");
	}
	private static boolean isSameString(String str1, String str2){
		/*
		 * check whether str1 and str2 are same or not(it can be possible that both string have same characters but different ordering)
		 * */
		if(str1.length() != str2.length())
			return false;
		int alphabet_cnt[][] = new int[2][26 * 2];//first 26 are for lowercase, second 26 are for uppercase
		
		for(int i = 0;i < str1.length();i++){
			
		}
	}
}
