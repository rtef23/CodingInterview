package Solutions;

import java.util.Scanner;

import Node.mNode;
import Queue.mQueue;

public class divideListWithN {
	/*
	 * p97, Q)2.4
	 * there is linked list, divide this list with n
	 * list 1 : list which node's value is smaller than n
	 * list 2 : list which node's value is larger than n
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mQueue<Integer> list = new mQueue<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the list size");
		int size = scan.nextInt();
		
		for(int i = 0;i < size;i++)
			list.enqueue(scan.nextInt());
		
		System.out.println("enter the N");
		int N = scan.nextInt();
		
		mQueue<Integer>l1 = new mQueue<>();
		mQueue<Integer>l2 = new mQueue<>();
		
		
		System.out.println("<before>");
		printList(list);
		
		divideList(N, list, l1, l2);
		System.out.println("\n<after> n : " + N);
		
		System.out.println("[list1]");
		printList(l1);
		System.out.println("[list2]");
		printList(l2);
		
	}
	private static void divideList(int n, mQueue<Integer> list, mQueue<Integer> list1, mQueue<Integer> list2){
		while(!list.isEmpty()){
			int tmp = list.dequeue();
			if(tmp < n)
				list1.enqueue(tmp);
			else
				list2.enqueue(tmp);
		}
	}
	private static void printList(mQueue<Integer> l){
		int cnt = 1;
		for(mNode<Integer> n = l.getHead().getNext();n != l.getTail();n = n.getNext(), cnt++){
			System.out.printf("[val : %d]\t", n.getVal());
			if(cnt % 6 == 0)
				System.out.println();
		}
		System.out.println();
	}
}
