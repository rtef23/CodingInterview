package Stack;

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
		
		new_node.val = val;
		new_node.next = head;
		head = new_node; 
		size++;
	}
	
	public T pop(){
		if(isEmpty())
			return null;
		
		mNode<T> rem_node = head;
		
		head = rem_node.next;
		size--;
		return rem_node.val;
	}
	
	public T peek(){
		if(isEmpty())
			return null;
		return (T)head.val;
	}
	
	public boolean isEmpty(){
		return head == null;
	}

	public mNode getHead(){
		return head;
	}
	
	private class mNode<T>{
		T val;
		mNode next;
	}
}
