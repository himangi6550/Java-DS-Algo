import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.*/
class searchInBST {
 public class TreeNode {
      int val;
     TreeNode left;
    TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }


    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return root;
        
        while(root!=null){
        
        if(root.val==val)
            return root;
        else if(root.val>val)
            root=root.left;
        else if(root.val<val)
            root=root.right;
        
    }return null;
}
}