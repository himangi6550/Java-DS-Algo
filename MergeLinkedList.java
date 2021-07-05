import java.util.*;

public class MergeLinkedList {
	
	Scanner sc=new Scanner(System.in);
	
	public class ListNode{
		int val=0;
		ListNode next=null;
		ListNode(int val) {
			this.val=val;
		}
	}

	public ListNode merge(ListNode l1,ListNode l2){
		if(l1==null ||l2==null)
			return l1!=null?l1:l2;
		ListNode c1=l1;
		ListNode c2=l2;
		ListNode dummy=new ListNode(-1);
		ListNode prev=dummy;
		
		while(c1!=null && c2!=null) {
			if(c1.val<c2.val) {
				prev.next=c1;
				c1=c1.next;
			}
			else {
				prev.next=c2;
				c2=c2.next;
			}
			prev=prev.next;
		}
		prev.next=c1!=null?c1:c2;
		return dummy.next;
	}
	
	public void printlist(ListNode node) {
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.next;
		}
	}
}
