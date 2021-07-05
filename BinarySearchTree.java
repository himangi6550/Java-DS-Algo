
public class BinarySearchTree {
	
	private TreeNode root;
	private class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		public TreeNode(int data) {
			this.data=data;
		}
	}
	
	public void insert(int value) {
		root=insertNode(root,value);
	}
	
	public TreeNode insertNode(TreeNode root,int value) {
		if(root==null) {
			root=new TreeNode(value);
			return root;
		}
		if(value<root.data)
			root.left=insertNode(root.left,value);
		else
			root.right=insertNode(root.right,value);
		return root;
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(TreeNode root) {
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public TreeNode search(int key) {
		return searchNode(root,key);
	}
	
	public TreeNode searchNode(TreeNode root,int key) {
		if(root==null || root.data==key) 
			return root;
		
		if(key<root.data)
			return searchNode(root.left,key);
		else
			return searchNode(root.right,key);
	}

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(3);
		bst.insert(63);
		bst.insert(34);
		bst.insert(343);
		bst.inOrder();
		System.out.println();
		if(bst.search(344)!=null)
			System.out.println("Key found");
		else
			System.out.println("Key not found");
		// TODO Auto-generated method stub

	}

}
