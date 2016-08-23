package Solutions;

import java.util.Scanner;

public class ReplaceString {
	/*
	 * p92, Q)1.4
	 * replace every sub string in string to target string
	 * */
	static int cur_index = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str;
		
		System.out.println("enter the string which you want maniplate");
		str = scan.nextLine();
		System.out.printf("String \'%s\' is maniplated to String \'%s\'", str, replaceString(str, "th", "s"));
	}
	private static String replaceString(String str, String from_str, String to_str){
		int from_str_pos = subStringIndex(str, from_str);
		if(from_str_pos < 0)
			return str;
		
		return str.substring(0, from_str_pos) + to_str + replaceString(str.substring(from_str_pos + from_str.length(), str.length()), from_str, to_str);
	}
	private static int subStringIndex(String target, String substr){
		/*
		 * return the index of first substr in target string
		 * -1 : if there is no substring
		 * this is a static method
		 * */
		int target_index = 0;
		int substr_index = 0;
		int start_index = -1;
		
		for(;target_index < target.length();target_index++){
			if(target.charAt(target_index) == substr.charAt(substr_index)){
				if(substr_index == 0)
					start_index = target_index;
				substr_index++;
				if(substr_index == substr.length()){
					return start_index;
				}
			}else{
				start_index = -1;
				substr_index = 0;
			}
		}
		return -1;
	}
	private static int countString(String str, String substr){
		int cnt = 0;
		int index_sub = 0;
		for(int i = 0;i < str.length();i++){
			if(str.charAt(i) == substr.charAt(index_sub)){
				index_sub++;
				if(index_sub == substr.length()){
					index_sub = 0;
					cnt++;
				}
			}
		}
		return cnt;
	}
}
