#include <iostream>
#include <algorithm>
#include <cmath>

using namespace std;

void rotateArr(int*, int);
void printArr(int*, int);

/*
	92p, Q)1.6
	rotate the array to right 90 side
*/
int main(){
	const int n = 4;
	const int n1 = 5;
	//int arr[n * n] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
	int arr[n1 * n1] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

	//printArr(arr, n);
	printArr(arr, n1);

	//rotateArr(arr, n);
	rotateArr(arr, n1);
	printf("\n\n");
	
	//printArr(arr, n);
	printArr(arr, n1);

	return 0;
}
void rotateArr(int* arr, int n){
	/*
		rotate the array
		assume that array is N x N size
	*/
	int cen = (n / 2);
	int level = (n / 2) + ((n % 2 == 0)? 0 : 1);
	int run_time = n - 1;

	
	
	for(;level > 0;level--){
		for(int i = 0;i < run_time;i++){
			int u_l, u_r, d_l, d_r;
			if(n % 2 == 0){
				//in even case
				u_l = (cen - level) * n + (cen - level + i);
				u_r = (cen - level + i) * n + (cen + level - 1);
				d_l = (cen + level - (i + 1)) * n + (cen - level);
				d_r = (cen + level - 1) * n + (cen + level - (i + 1));
			}else{
				//in odd case
				u_l = (cen - level + 1) * n + (cen - level + i + 1);
				u_r = (cen - level + 1 + i) * n + (cen + level - 1);
				d_l = (cen + level - 1 - i) * n + (cen - level + 1);
				d_r = (cen + level - 1) * n + (cen + level - 1 - i);
			}

			int tmp = arr[u_l];
			arr[u_l] = arr[d_l];
			arr[d_l] = arr[d_r];
			arr[d_r] = arr[u_r];
			arr[u_r] = tmp;
		}
		run_time -= 2;
	}
}

void printArr(int* arr, int n){
	for(int i = 0;i < n;i++){
		for(int j = 0;j < n;j++)
			printf("----");
		printf("-\n");
		printf("|");
		for(int j = 0;j < n;j++)
			printf("%3d|", arr[i * n + j]);
		printf("\n");
	}
	for(int j = 0;j < n;j++)
		printf("----");
	printf("-\n");
}