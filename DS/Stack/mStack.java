package Stack;

import Node.mNode;

public class mStack <T>{
	private mNode head;
	private int size;
	
	public mStack() {
		// TODO Auto-generated constructor stub
		size = 0;
	}
	
	public int Size(){
		return size;
	}
	
	public void push(T val){
		mNode new_node = new mNode<>();

		new_node.setVal(val);
		new_node.setNext(head);
		head = new_node; 
		size++;
	}
	
	public T pop(){
		if(isEmpty())
			return null;
		
		mNode<T> rem_node = head;
		
		head = rem_node.getNext();
		size--;
		return rem_node.getVal();
	}
	
	public T peek(){
		if(isEmpty())
			return null;
		return (T)head.getVal();
	}
	
	public boolean isEmpty(){
		return head == null;
	}

	public mNode getHead(){
		return head;
	}
	
}
