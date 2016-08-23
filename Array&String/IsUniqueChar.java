import java.util.Scanner;

public class IsUniqueChar {
	/*
	 * 92p, Q)1.1
	 * return the result that character in string is unique or not
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string which you want to test : ");
		Scanner scan = new Scanner(System.in);
		System.out.println(isUniqueChar(scan.next())? "is All unique":"is not All unique" );
	}
	public static boolean isUniqueChar(String str){
		/*
		 * check the character whether every character in string are unique or not
		 * assume that every character are alphabet(26) and they are composed of uppercase and lowercase
		 * differentiate uppercase and lowercase
		 * string is composed of alphabet, special symbols
		 * */
		
		boolean alphabet[] = new boolean[26 * 2];//first 26 are for lowercase, sencond 26 are for uppercase 
		
		for(int i = 0;i < str.length();i++){
			char tmp = str.charAt(i);
			if(tmp <= 'z' && tmp >= 'a'){//in lowercase case
				if(alphabet[tmp - 'a'])
					return false;
				else
					alphabet[tmp - 'a'] = true;
			}else if(tmp <= 'Z' && tmp >= 'A'){//in uppercase case
				if(alphabet[tmp - 'A' + 26])
					return false;
				else
					alphabet[tmp - 'A' + 26] = true;
			}else{//in not alphabet
				continue;
			}
		}
		
		return true;
	}
}
