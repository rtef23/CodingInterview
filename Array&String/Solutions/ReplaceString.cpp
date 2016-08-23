#include <iostream>
#include <stdlib.h>
#include <string>

using namespace std;

string replaceString(string, string, string);
int subStrIndex(string, string);

int main(){
	string str;

	cout << "enter the string which you want to maniplate" << endl;
	getline(cin, str);
	printf("string \'%s\' is maniplated to string\'%s\'\n", str.c_str(), replaceString(str, "th", "s").c_str());

	return 0;
}

string replaceString(string original, string from, string to){
	int from_pos = subStrIndex(original, from);
	
	if(from_pos < 0)
		return original;
	return original.substr(0, from_pos) + to + replaceString(original.substr(from_pos + from.length(), original.length()), from, to);
}

int subStrIndex(string original, string target){
	/*
	return the index which is first index of target string in original string
	if there is no taget string then return -1
	*/
	int target_index = 0;
	int start_index = -1;

	for(int i = 0;i < original.length();i++){
		if(original[i] == target[target_index]){
			if(target_index == 0)
				start_index = i;
			target_index++;
			if(target_index == target.length())
				return start_index;
		}else{
			start_index = -1;
			target_index = 0;
		}
	}
	return -1;
}