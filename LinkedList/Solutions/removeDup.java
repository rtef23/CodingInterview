package Solutions;

import java.util.HashSet;

import Node.mNode;
import Queue.mQueue;

public class removeDup {
	/*
	 * p96 Q)2.1
	 * 1)remove the duplicate character at the un sorted linked list
	 * 2)without buffer, remove the duplicate character at the un sorted linked list
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mQueue<Character> q = new mQueue<>();
		
		{//input data at the queue
			q.enqueue('C');
			q.enqueue('A');
			q.enqueue('D');
			q.enqueue('Q');
			q.enqueue('S');
			q.enqueue('A');
			q.enqueue('P');
			q.enqueue('D');
			q.enqueue('D');
			q.enqueue('J');
			q.enqueue('N');
			q.enqueue('M');
			q.enqueue('C');
		}
		
		System.out.println("<before>");
		printQueue(q);
		
		//removeDupWithBuffer(q);
		removeDupWithoutBuffer(q);
		
		System.out.println("<after>");
		printQueue(q);
	}
	
	private static void removeDupWithBuffer(mQueue<Character> q){
		/*
		 * with buffer, remove dup
		 * running time : O(n)
		 * storage : O(n)
		*/
		HashSet<Character> ext_char = new HashSet<>();
		
		for(mNode<Character> n = q.getTail().getPrev();n != q.getHead();n = n.getPrev()){
			if(ext_char.contains(n.getVal())){
				n.getNext().setPrev(n.getPrev());//remove this node
				n.getPrev().setNext(n.getNext());
			}else{
				ext_char.add(n.getVal());//add this node's val at the exist set
			}
		}
	}
	private static void removeDupWithoutBuffer(mQueue<Character> q){
		/*
		 * without buffer, remove dup
		 * running time : O(n^2)
		 * storage : O(1)
		 */
		for(mNode<Character> n = q.getTail().getPrev();n != q.getHead();n = n.getPrev()){
			for(mNode<Character> n1 = n.getPrev();n1 != q.getHead();n1 = n1.getPrev()){
				if((Character)n.getVal() == (Character)n1.getVal()){
					//remove this node
					n1.getNext().setPrev(n1.getPrev());
					n1.getPrev().setNext(n1.getNext());
				}
			}
		}
	}
	
	private static void printQueue(mQueue<Character> q){
		int cnt = 1;
		for(mNode n = q.getTail().getPrev();n != q.getHead();n = n.getPrev(), cnt++){
			System.out.printf("[val : %c]\t", n.getVal());
			if(cnt % 5 == 0)
				System.out.println();
		}
		System.out.println();
	}
}
