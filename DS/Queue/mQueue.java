package Queue;

public class mQueue <T>{
	mNode head;
	mNode tail;
	int size;
	
	public mQueue() {
		// TODO Auto-generated constructor stub
		head = new mNode<>();
		tail = new mNode<>();
		size = 0;
		
		head.next = tail;
		head.prev = null;
		tail.prev = head;
		tail.next = null;
	}
	
	public int Size(){
		return size;
	}
	
	public void enqueue(T val){
		mNode new_node = new mNode<>();
		
		new_node.val = val;
		new_node.next = head.next;
		new_node.prev = head;
		head.next.prev = new_node;
		head.next = new_node;
		size++;
	}
	
	public T dequeue(){
		if(isEmpty())
			return null;
		mNode rem_node = tail.prev;
		
		rem_node.prev.next = tail;
		tail.prev = rem_node.prev;
		size--;
		return (T)rem_node.val;
	}
	
	public T peek(){
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
