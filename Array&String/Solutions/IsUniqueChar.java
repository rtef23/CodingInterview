package Solutions;

import java.util.Scanner;

public class IsUniqueChar {
	/*
	 * 92p, Q)1.1
	 * return the result whether every character in string are unique or not
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string which you want to check");
		Scanner scan = new Scanner(System.in);
		System.out.println(isUniqueChar(scan.next())? "is All Unique" : "in not All Unique");
		scan.close();
	}
	private static boolean isUniqueChar(String str){
		/*
		 * check whether every character in string are unique or not
		 * assume that every character in string are composed of alphabet
		 * differentiate uppercase and lowercase
		 * */
		if(str.length() > 52)
			return false;
		boolean alphabet[] = new boolean[26 * 2];//first 26 are for lowercase, second 26 are for uppercase
		
		for(int i = 0;i < str.length();i++){
			char tmp = str.charAt(i);
			if(tmp >= 'a' && tmp <= 'z'){//in lowercase case
				if(alphabet[tmp - 'a'])
					return false;
				else
					alphabet[tmp - 'a'] = true;
			}else if(tmp >= 'A' && tmp <= 'Z'){//in uppercase case
				if(alphabet[tmp - 'A' + 26])
					return false;
				else
					alphabet[tmp - 'A' + 26] = true;
			}
		}
		return true;
	}
}
