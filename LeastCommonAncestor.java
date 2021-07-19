public class Tree {
 public boolean find(TreeNode root, int val)
{
    if (!root)
        return false;
    if (root.val == val)
        return true;
    if ((root.left && find(root.left, val)) || (root.right && find(root.right, val)))
        return true;
    return false;
}

public TreeNode LCA(TreeNode root, int val1, int val2)
{
    if (!root || root.val == val1 || root.val == val2)
        return root;
    
    auto L = LCA(root.left, val1, val2);
    auto R = LCA(root.right, val1, val2);
    
    if (L && R)
        return root;
    return L ? L : R;
}

public int lca(TreeNode A, int val1, int val2) {
    if (!find(A, val1) || !find(A, val2))
        return -1;
    auto ancestor = LCA(A, val1, val2);
    if (ancestor)
        return ancestor.val;
    return -1;
}

    
}

public class LeastCommonAncestor {
	public static void main(String args[]) {
		Tree s=new Tree();
//		int nums1[]={1,2,3,2,1};
//		int nums2[]={3,2,1,4,7};
		int anc=s.lca(nums1,nums2);
		
		System.out.println(anc);
		}

}
