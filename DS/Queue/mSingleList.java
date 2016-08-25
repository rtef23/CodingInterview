package Queue;

import Node.mNode;

public class mSingleList <T>{
	/*
	 * singly linked list
	 * this DS is implemented, only using next pointer at the mNode 
	 * */
	mNode<T>head;
	int size;
	
	public mSingleList() {
		// TODO Auto-generated constructor stub
		size = 0;
		head = new mNode<>();
	}
	
	public boolean isEmpty(){
		return head.getNext() == null;
	}
	public int Size(){
		return size;
	}
	public void add(T val){
		mNode<T> new_node = new mNode<>();
		mNode<T> tmp;
		
		new_node.setVal(val);
		for(tmp = head;tmp.getNext() != null;tmp = tmp.getNext())
			;
		tmp.setNext(new_node);
			
		size++;
	}
	public mNode<T> getHead(){
		return head;
	}
}
