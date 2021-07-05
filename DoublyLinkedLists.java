import java.util.NoSuchElementException;
public class DoublyLinkedLists {
private ListNode head;
private ListNode tail;
private int length;
	
	
	private class ListNode {
		private int data;
		private ListNode next;
		private ListNode prev;
		public ListNode(int data) {
			this.data=data;
		}
}
	public DoublyLinkedLists() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	
	
	public boolean isEmpty() {
	return length==0;}
	
	public int length() {
	return length;}
	
	public void displayForward() {
		if(head==null)
			return;
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public void displayBackward() {
		if(head==null)
			return;
		ListNode temp=tail;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		System.out.println("null");
	}
	
	public void insertAtStart(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty())
			tail=newNode;
		else
			head.prev=newNode;
		newNode.next = head;
	head = newNode;
	length++;
	}
	
	public void insertAtEnd(int value) {
		ListNode node = new ListNode(value);
		if(isEmpty())
			head=node;
		else {
			tail.next=node;
			node.prev=tail;
		}
		tail=node;
		length++;
		}
	
	public ListNode deleteFirst() {
		if(isEmpty())
			throw new NoSuchElementException();
		ListNode temp=head;
		if(head==tail)
			tail=null;
		else
			head.next.prev=null;
		head=head.next;
		temp.next=null;
		length--;
		return temp;
		
	}
	
	public ListNode deleteLast() {
		if(isEmpty())
			throw new NoSuchElementException();
		ListNode temp=tail;
		if(head==tail)
			head=null;
		else
			tail.prev.next=null;
		tail=tail.prev;
		temp.prev=null;
		length--;
		return temp;
		
	}
	
	public static void main(String args[]) {
		DoublyLinkedLists dll=new DoublyLinkedLists();
		dll.insertAtStart(8);
		dll.insertAtEnd(87);
		dll.insertAtEnd(34);
		dll.insertAtStart(12);
		dll.insertAtEnd(4);
		dll.displayForward();
		dll.displayBackward();
		dll.deleteFirst();
		dll.deleteLast();
		dll.displayForward();
		
	}
	
}
