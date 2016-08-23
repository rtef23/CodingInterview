#include <iostream>
#include <stdlib.h>
#include <string.h>


#define BUFFER 1024

using namespace std;

void reverseString(char* str, char* rev_str);

int main(){
	char str[BUFFER];
	char rev_str[BUFFER];

	cout << "enter the string which you want to reverse." << endl;
	cin.getline(str, BUFFER);
	reverseString(str, rev_str);
	cout << "string \'" << str << "\' is reversed to \'" <<rev_str << "\'" << endl;
	return 0;
}
void reverseString(char* str, char* rev_str){
	int str_len = strlen(str);

	for(int i = str_len;i >= 0;i--)
		rev_str[str_len - i] = str[i - 1];
	rev_str[str_len] = '\0';
}