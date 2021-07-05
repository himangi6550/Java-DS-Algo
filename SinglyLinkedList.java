//import SinglyLinkedList.Node;

public class SinglyLinkedList{
	private ListNode head;
	
	
	private static class ListNode {
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
}
	
	public int length() {
		if(head==null)
			return 0;
		int count=0;
		ListNode curr=head;
		while(curr!=null) {
			count++;
			curr=curr.next;
		}	
		return count; 
	}
	
	public void insertAtStart(int data) {
		ListNode node = new ListNode(data);
	//node.data = data;
	node.next = head;
	head = node;
	}
	
	public void insertAtEnd(int data) {
		ListNode node = new ListNode(data);
		//node.data = data;
		//node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			ListNode n = head;
			while(n.next != null) {
				n=n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAt(int index,int data) {
		ListNode node = new ListNode(data);
//	node.data = data;
//	node.next = null;
	
	ListNode n= head;
	if(index==0) {
		insertAtStart(data);
	}
	else {
		for(int i=0;i<index-1;i++) {
			n=n.next;
		}
		node.next = n.next;
		n.next = node;
	}
	
}
	
	public void deleteAt(int index) {
	if(index==0) {
		head=head.next;
	}
	else {
		ListNode n= head;
		ListNode n1 = null;
		for(int i=0;i<index-1;i++) {
			n=n.next;
		}
		n1=n.next;
		n.next=n1.next;
		n1 = null;
		//System.out.println("deleted data:"+n1.data);
	}
}
	public void display() {
		ListNode n = head;
		while(n!= null) {
			System.out.print(n.data+" -->");
			n=n.next;
			}
			System.out.println("null");
		}
	
	
	public static void main(String args[]) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.head=new ListNode(10);
		ListNode sec= new ListNode(1);
		ListNode third= new ListNode(16);
		ListNode fourth= new ListNode(133);
		
		list.head.next=sec;
		sec.next=third;
		third.next=fourth;
		list.insertAtStart(489);
		list.insertAtEnd(6);
		list.insertAt(2,89);
		list.insertAt(0,23);
		list.insertAtEnd(10);
		list.insertAtEnd(70);
		list.deleteAt(0);
		list.display();
		System.out.println("Length: "+list.length());
		
	}



	}
//		
//		list.insert(55);
//		list.insert(33);
//		
//		
//		
		

//	}
//
//
//
//}
//	
//	

//



//	
//

	