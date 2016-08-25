package Queue;

import Node.mNode;

public class mQueue <T>{
	mNode head;
	mNode tail;
	int size;
	
	public mQueue() {
		// TODO Auto-generated constructor stub
		head = new mNode<>();
		tail = new mNode<>();
		size = 0;

		head.setPrev(null);
		head.setNext(tail);
		tail.setPrev(head);
		tail.setNext(null);
	}
	
	public int Size(){
		return size;
	}
	
	public void enqueue(T val){
		mNode new_node = new mNode<>();
		
		new_node.setVal(val);
		new_node.setNext(head.getNext());
		new_node.setPrev(head);
		
		head.getNext().setPrev(new_node);
		head.setNext(new_node);
		size++;
	}
	
	public T dequeue(){
		if(isEmpty())
			return null;
		mNode rem_node = tail.getPrev();
		
		rem_node.getPrev().setNext(tail);
		tail.setPrev(rem_node.getPrev());;
		size--;
		return (T)rem_node.getVal();
	}
	
	public T peek(){
		if(isEmpty())
			return null;
		return (T)tail.getPrev().getVal();
	}

	public boolean isEmpty(){
		return head.getNext() == tail;
	}

	public mNode getHead(){
		return head;
	}
	public mNode getTail(){
		return tail;
	}
	
}
