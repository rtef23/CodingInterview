package Node;

public class mNode <T>{
	private T val;
	private mNode prev;
	private mNode next;
	
	public void setVal(T val){
		this.val = val;
	}
	public T getVal(){
		return val;
	}
	public void setPrev(mNode n){
		this.prev = n;
	}
	public mNode getPrev(){
		return prev;
	}
	public void setNext(mNode n){
		this.next = n;
	}
	public mNode getNext(){
		return next;
	}
}
