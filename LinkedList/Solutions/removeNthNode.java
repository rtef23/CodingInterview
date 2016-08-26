package Solutions;

import java.util.Scanner;

import Node.mNode;
import Queue.mSingleList;

public class removeNthNode {
	/*
	 * p97 Q)2.3
	 * at the single linked list, remove node
	 * caution! you can access only node which will be removed
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the n");
		int n = scan.nextInt();
		mSingleList<Character> sll = new mSingleList<>();
		
		{//data input
			sll.add('A');
			sll.add('B');
			sll.add('C');
			sll.add('D');
			sll.add('E');
			sll.add('F');
			sll.add('G');
			sll.add('H');
			sll.add('I');
			sll.add('J');
			sll.add('K');
			sll.add('L');
			sll.add('M');
			sll.add('N');
			sll.add('O');
			sll.add('P');
			sll.add('Q');
			sll.add('R');
			sll.add('S');
			sll.add('T');
			sll.add('U');
			sll.add('V');
			sll.add('W');
			sll.add('X');
			sll.add('Y');
			sll.add('Z');
		}
		
		
		System.out.println("<before>");
		printSLL(sll);
		
		removeNode(sll.getNthNode(n));
		
		System.out.println("<after>");
		printSLL(sll);
	}
	private static void removeNode(mNode<Character> rem_node){
		/*
		 * remove rem_node from single linked list
		 * 
		 * !!!)when given node is last node, then there is no way to remove node(!!!
		 * */
		for(mNode<Character> n = rem_node;n.getNext() != null;n = n.getNext()){
			n.setVal((Character)n.getNext().getVal());
		}
	}
	private static void printSLL(mSingleList<Character> sll){
		int cnt = 1;
		for(mNode<Character> n = sll.getHead().getNext();n != null;n = n.getNext()){
			System.out.printf("[val : %c]\t", n.getVal());
			if(cnt % 6 == 0)
				System.out.println();
			cnt++;
		}
		System.out.println("\n");
	}
}
