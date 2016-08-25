package Solutions;

import java.util.Scanner;

public class IsRotateString {
	/*
	 * p93 Q)1.8
	 * with string s1, s2, check whether s2 is the rotated string s1 or not
	 * assume that there is function isSubString() which is detect that s1 contains s2 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String s1, s2;
		System.out.println("enter string s1");
		s1 = scan.nextLine();
		System.out.println("enter string s2");
		s2 = scan.nextLine();
		System.out.println(isRotated(s1, s2));
	}
	private static boolean isRotated(String s1, String s2){
		if(s1.length() != s2.length())
			return false;
		return isSubString((s1 + s1), s2);
	}
	private static boolean isSubString(String a, String b){
		/*
		 * return
		 * 		true	:	when string a contains string b
		 * 		false	:	when string a does not contains string b
		 * */
		return a.contains(b);
	}
}
