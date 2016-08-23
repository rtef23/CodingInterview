package Solutions;

import java.util.Scanner;

public class IsSameString {
	/*
	 * p92, Q)1.3
	 * return the result whether str1, str2 are the same string or not
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the string1");
		String str1 = scan.next();
		System.out.println("enter the string2");
		String str2 = scan.next();
		
		System.out.printf("String \'%s\' and String \'%s\' is%ssame.", str1, str2, isSameString(str1, str2)? " " : " not ");
		
		scan.close();
	}
	private static boolean isSameString(String str1, String str2){
		/*
		 * return the result whether str1 and str2 have same characters
		 * assume that string is composed of alphabet, number
		 * */
		if(str1.length() != str2.length())
			return false;
		
		int alphabet_cnt[][] = new int[2][26 * 2 + 10];
		
		for(int i = 0;i < str1.length();i++){
			if(str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z'){
				alphabet_cnt[0][str1.charAt(i) - 'a']++;
			}else if(str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z'){
				alphabet_cnt[0][str1.charAt(i) - 'A' + 26]++;
			}else if(str1.charAt(i) >= '0' && str1.charAt(i) <= '9'){
				alphabet_cnt[0][str1.charAt(i) - '0' + (26 * 2)]++;
			}
			if(str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z'){
				alphabet_cnt[1][str2.charAt(i) - 'a']++;
			}else if(str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z'){
				alphabet_cnt[1][str2.charAt(i) - 'A' + 26]++;
			}else if(str2.charAt(i) >= '0' && str2.charAt(i) <= '9'){
				alphabet_cnt[1][str2.charAt(i) - '0' + (26 * 2)]++;
			}
		}
		for(int i = 0;i < 26 * 2 + 10;i++)
			if(alphabet_cnt[0][i] != alphabet_cnt[1][i])
				return false;
		return true;
	}
}
