public class LowestCommonAncestor{
    /* ALGORITHM
1. Search the two Nodes in the Binary Tree.
2. If Node found return node else return null.
3. If some Node receives both left and right pointer as NOT null, then it is LCA else return what it receive.




*/
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
    /**
     * @param root: The root of the binary search tree.
     * @param A and B: two nodes in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
        if(root==null){
            return null;
        }
        if(A ==root||B==root){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,A,B);
        TreeNode right=lowestCommonAncestor(root.right,A,B);

        if(left!=null && right!=null){
            return root;
        }
        if(left==null){
            return right;
        }
        else{
            return left;
        }

    }

}