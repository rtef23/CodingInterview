package Solutions;

import java.util.Scanner;

public class CompressStr {
	/*
	 * 92p, Q)1.5
	 * return the string which is compressed from original string
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String original;
		
		System.out.println("enter the string which you want to compress");
		original = scan.nextLine();
		System.out.println(compressStr(original));
	}
	private static String compressStr(String original){
		/*
		 * return the compressed string, if compressed string's length is longer than original string then return the original string
		 * */
		String result = new String();
		char tmp = '\0';
		int cnt = 0;
		boolean isflushed = false;
		
		for(int i = 0;i < original.length();i++){
			if(tmp != original.charAt(i)){
				if(tmp != '\0'){
					result += tmp;
					result += cnt;
				}
				isflushed = true;
				cnt = 1;
				tmp = original.charAt(i);
			}else{
				cnt++;
				isflushed = false;
			}
		}
		if(!isflushed){
			result += tmp;
			result += cnt;
		}
		return (result.length() > original.length())? original:result;
	}
}
