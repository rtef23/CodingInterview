package Queue;

public class mDeQueue <T>{
	mNode head;
	mNode tail;
	int size;

	public mDeQueue() {
		// TODO Auto-generated constructor stub
		head = new mNode<>();
		tail = new mNode<>();
		size = 0;
		
		head.prev = null;
		head.next = tail;
		tail.prev = head;
		tail.next = null;
	}
	
	public int Size(){
		return size;
	}
	
	public void pushAtHead(T val){
		mNode<T> new_node = new mNode<>();
		
		new_node.val = val;
		new_node.prev = head;
		new_node.next = head.next;
		head.next.prev = new_node;
		head.next = new_node;
		size++;
	}
	
	public void pushAtTail(T val){
		mNode<T> new_node = new mNode<>();
		
		new_node.val = val;
		new_node.prev = tail.prev;
		new_node.next = tail;
		tail.prev.next = new_node;
		tail.prev = new_node;
		size++;
	}
	
	public T popFromHead(){
		if(isEmpty())
			return null;
		mNode<T> rem_node = head.next;
		
		head.next = rem_node.next;
		rem_node.next.prev = head;
		size--;
		return (T)rem_node.val;
	}
	
	public T popFromTail(){
		if(isEmpty())
			return null;
		mNode<T> rem_node = new mNode<>();
		
		tail.prev = rem_node.prev;
		rem_node.prev.next = tail;
		size--;
		return (T)rem_node.val;
	}
	
	public T peekAtHead(){
		if(isEmpty())
			return null;
		return (T)head.next.val;
	}
	
	public T peekAtTail(){
		if(isEmpty())
			return null;
		return (T)tail.prev.val;
	}

	public boolean isEmpty(){
		return head.next == tail;
	}
	
	private class mNode<T>{
		T val;
		mNode prev;
		mNode next;
	}
}
