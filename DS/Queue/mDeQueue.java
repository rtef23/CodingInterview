package Queue;
import Node.mNode;

public class mDeQueue <T>{
	mNode head;
	mNode tail;
	int size;

	public mDeQueue() {
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
	
	public void pushAtHead(T val){
		mNode<T> new_node = new mNode<>();
		
		new_node.setVal(val);
		new_node.setPrev(head);
		new_node.setNext(head.getNext());
		
		head.getNext().setPrev(new_node);
		head.setNext(new_node);
		size++;
	}
	
	public void pushAtTail(T val){
		mNode<T> new_node = new mNode<>();

		new_node.setVal(val);
		new_node.setPrev(tail.getPrev());
		new_node.setNext(tail);
		
		tail.getPrev().setNext(new_node);
		tail.setPrev(new_node);
		size++;
	}
	
	public T popFromHead(){
		if(isEmpty())
			return null;
		mNode<T> rem_node = head.getNext();
		
		head.setNext(rem_node.getNext());
		rem_node.getNext().setPrev(head);
		size--;
		return (T)rem_node.getVal();
	}
	
	public T popFromTail(){
		if(isEmpty())
			return null;
		mNode<T> rem_node = new mNode<>();
		
		tail.setPrev(rem_node.getPrev());
		rem_node.getPrev().setNext(tail);
		size--;
		return (T)rem_node.getVal();
	}
	
	public T peekAtHead(){
		if(isEmpty())
			return null;
		return (T)head.getNext().getVal();
	}
	
	public T peekAtTail(){
		if(isEmpty())
			return null;
		return (T)tail.getPrev().getVal();
	}

	public boolean isEmpty(){
		return head.getNext() == tail;
	}
}
