import java.util.*;
//import java.util.Stack;
//import java.util.LinkedList;
public class binaryTree {
	private TreeNode root;
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		public TreeNode(int data) {
			this.data=data;
		}
	}

	public void createBinaryTree() {
		TreeNode first=new TreeNode(9);
		TreeNode sec=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		TreeNode fifth=new TreeNode(44);
		
		root=first;
		first.left=sec;
		first.right=third;
		sec.left=fourth;
		third.left=fifth;
	}
	
	public void recursivePreOrder(TreeNode root) {
		
		if(root==null)
			return;
		System.out.print(root.data+" ");
		recursivePreOrder(root.left);
		recursivePreOrder(root.right);
		
	}
	
	public void iterativePreOrder(TreeNode root) {
		
		System.out.println("Iterative Pre-Order Traversal:");
		if(root==null)
			return;
		
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode temp=stack.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null)
				stack.push(temp.right);
			if(temp.left!=null)
				stack.push(temp.left);
		}System.out.println();
	}
	
	public void recursiveInOrder(TreeNode root) {
		if(root==null)
			return;
		recursiveInOrder(root.left);
		System.out.print(root.data+" ");
		recursiveInOrder(root.right);
		
	}
	
	public void iterativeInOrder(TreeNode root) {
		System.out.println("Iterative In-Order Traversal:");
	   if(root==null)
		   return;
	   Stack<TreeNode> stack=new Stack<>();
	   TreeNode temp=root;
	   while(!stack.isEmpty() || temp!=null) {
		   if(temp!=null) {
			   stack.push(temp);
			   temp=temp.left;
		   }
		   else {
			   temp=stack.pop();
			   System.out.print(temp.data+" ");
			   temp=temp.right;
		   }
	   }System.out.println();
	}
	
	public void recursivePostOrder(TreeNode root) {
		if(root==null)
			return;
		recursiveInOrder(root.left);
		recursiveInOrder(root.right);
		System.out.print(root.data+" ");
		
	}
	
public void iterativePostOrder(TreeNode root) {
		
		System.out.println("Iterative Post-Order Traversal:");
		if(root==null)
			return;
		TreeNode curr=root;
		Stack<TreeNode> stack=new Stack<>();
		
		while(curr!=null || !stack.isEmpty()) {
			if(curr!=null) {
				stack.push(curr);
				curr=curr.left;
			}
			else {
				TreeNode temp=stack.peek().right;
				if(temp==null) {
					temp=stack.pop();
					System.out.print(temp.data+" ");
					while(!stack.isEmpty() && temp==stack.peek().right) {
						temp=stack.pop();
						System.out.print(temp.data+" ");
					}
				}
				else {
					curr=temp;
				}
			}
		}System.out.println();
	}

public void levelOrder(TreeNode root) {
	System.out.println("Level Order Traversal:");
	if(root==null)
		return;
	Queue<TreeNode> queue=new LinkedList<>();
	queue.add(root);
	while(!queue.isEmpty()) {
		TreeNode temp=queue.remove();
		System.out.print(temp.data+" ");
		if(temp.left!=null)
			queue.add(temp.left);
		if(temp.right!=null)
			queue.add(temp.right);
	}
}

	public static void main(String args[]) {
		binaryTree bt=new binaryTree();
		bt.createBinaryTree();
		System.out.println("Recursive Pre-Order Traversal:");
		bt.recursivePreOrder(bt.root);
		System.out.println();
		bt.iterativePreOrder(bt.root);
		System.out.println("Recursive In-Order Traversal:");
		bt.recursiveInOrder(bt.root);
		System.out.println();
		bt.iterativeInOrder(bt.root);
		System.out.println("Recursive Post-Order Traversal:");
		bt.recursivePostOrder(bt.root);
		System.out.println();
		bt.iterativePostOrder(bt.root);
		bt.levelOrder(bt.root);
	}
}
