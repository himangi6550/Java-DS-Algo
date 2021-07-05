
public class MaxValue {
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
		TreeNode fourth=new TreeNode(48);
		TreeNode fifth=new TreeNode(44);
		
		root=first;
		first.left=sec;
		first.right=third;
		sec.left=fourth;
		third.left=fifth;
	}


public int findMax() {
	return findMax(root);
}

public int findMax(TreeNode root) {
	
	if(root==null)
		return Integer.MIN_VALUE;
	
	int result=root.data;
	int left=findMax(root.left);
	int right=findMax(root.right);
	
	if(left >result)
		result=left;
	if(right >result)
		result=right;
	return result;	
			
}
public static void main(String args[]) {
	MaxValue bt=new MaxValue();
	bt.createBinaryTree();
	int m=bt.findMax();
	System.out.print("Max: "+m);
}
}
