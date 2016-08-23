#include <iostream>

using namespace std;

string compressStr(string);

int main(){
	string in_str;

	cout << "enter the string which you want to compress" << endl;
	getline(cin, in_str);
	printf("%s\n", compressStr(in_str).c_str());
	return 0;
}
string compressStr(string original){
	/*
	* return the compressed string, if compressed string's length is longer than original string then return the original string
	* */
	string result;
	char tmp = '\0';
	int cnt = 0;
	bool isflushed = false;

	for(int i = 0;i < original.length();i++){
		if(tmp != original.at(i)){
			if(tmp != '\0'){
				result += tmp;
				result += to_string(cnt);
				isflushed = true;
			}
			tmp = original.at(i);
			cnt = 1;
		}else{
			cnt++;
			isflushed = false;
		}
	}
	if(!isflushed){
		result += tmp;
		result += to_string(cnt);
	}
	return (result.length() > original.length())? original:result;
}