package Solutions;

import java.util.Scanner;

import Node.mNode;
import Queue.mSingleList;

public class findKthElement {
	/*
	 * p97 Q)2.2
	 * at the single linked list, find k th element from tail(caution! there is no tail pointer)
	 * */
	public static void main(String[] args) {
		mSingleList<Character> msl = new mSingleList<>();
		
		{//data input
			msl.add('A');
			msl.add('B');
			msl.add('C');
			msl.add('D');
			msl.add('E');
			msl.add('F');
			msl.add('G');
			msl.add('H');
			msl.add('I');
			msl.add('J');
			msl.add('K');
			msl.add('L');
			msl.add('M');
			msl.add('N');
			msl.add('O');
			msl.add('P');
			msl.add('Q');
			msl.add('R');
			msl.add('S');
			msl.add('T');
			msl.add('U');
			msl.add('V');
			msl.add('W');
			msl.add('X');
			msl.add('Y');
			msl.add('Z');
		}
		Scanner scan = new Scanner(System.in);
		int k;
		
		System.out.println("enter the integer \'k\'");
		k = scan.nextInt();
		
		Character tmp;
		System.out.println(((tmp = getKthElement(msl, k)) == '\0')?"null":tmp);
		
		scan.close();
	}
	public static Character getKthElement(mSingleList<Character> msl, int k){
		/*
		 * return k th element from tail, at the single linked list
		 * if single linked list size is smaller than k then return null
		 * */
		mNode<Character> first_node;
		mNode<Character> second_node = null;
		int cnt = 0;
		
		for(first_node = msl.getHead().getNext();first_node != null;first_node = first_node.getNext()){
			cnt++;
			if(cnt == k){//cnt == k
				second_node = msl.getHead().getNext();
			}else if(cnt > k){
				second_node = second_node.getNext();
			}
		}
		return (second_node == null)? '\0':second_node.getVal();
	}
}
