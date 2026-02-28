package Intlist;
public class DLList {	
	private static class IntNode {
		public int item;
		public IntNode next;
		public IntNode prev;

		public IntNode(int i, IntNode n, IntNode p) {
			item = i;
			next = n;
			prev = p;
		}
	}

	/* The first item (if it exists) is at sentinel.next. */
	private IntNode sentinel;
	private int size;

	/** Creates an empty SLList. */
	public DLList() {
		sentinel = new IntNode(63, null,null);
		size = 0;
	}

	public DLList(int x) {
		sentinel = new IntNode(63, null,null);
    	IntNode newNode = new IntNode(x, sentinel, sentinel);
    	sentinel.next = newNode;
    	sentinel.prev = newNode;
		size = 1;
	}

 	/** Adds x to the front of the list. */
 	public void addFirst(int x) {
    	IntNode newNode = new IntNode(x, sentinel.next, sentinel);
    	sentinel.next.prev = newNode; // 更新原首节点的prev
    	sentinel.next = newNode;
    	size = size + 1;
 	}

 	/** Returns the first item in the list. */
 	public int getFirst() {
 		return sentinel.next.item;
 	}

 	/** Adds x to the end of the list. */
 	public void addLast(int x) {
		IntNode newNode = new IntNode(x, sentinel, sentinel.prev);
    	sentinel.prev.next = newNode; // 更新原尾节点的next
    	sentinel.prev = newNode;
    	size = size + 1;
 	}

	public int getlast(){
		return sentinel.prev.item;
	}

	public void removelast(){
		if(size==0){
			System.out.println("empty");
		}
		sentinel.prev=sentinel.prev.prev;
		sentinel.prev.next=sentinel;
		size = size-1;
	}

 	
	/** Returns the size of the list. */
	public int size() {
		return size;
 	}

	public static void main(String[] args) {
 		/* Creates a list of one integer, namely 10 */
 		DLList L = new DLList();
 		L.addLast(20);
 		System.out.println(L.size());
 	}
}