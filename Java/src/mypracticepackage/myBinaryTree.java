package mypracticepackage;

public class myBinaryTree {
  
  private TreeNode root;
  
  public myBinaryTree(){
    this.root = null;
  }
  
  public void insert(Integer data) {
    TreeNode newNode = new TreeNode(data, null, null);
    if (root == null) {
      root = newNode;
    }
    else {
      TreeNode current = root;
      TreeNode parent = null;
      while(true) {
        parent = current;
        if (data < current.data){
          current = current.left;
          if (current == null){
            current = newNode;
            return;
          }
        } else {
          current = current.right;
          if (current == null){
            current = newNode;
            return;
          }
        }
      }
    }
  }
  
  public void display(TreeNode root) {
    if (root != null) {
      display(root.left);
      System.out.println(" " + root.data);
      display(root.right);
    }
  }
  /*
   * InnerClass for Nodes in the tree
   */
  public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;
    
    public TreeNode(Integer data, TreeNode left, TreeNode right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }
  /*
   * End of inner class
   
  
  public static void main(String[] args) {
    myBinaryTree bst   = new myBinaryTree();
    Integer m = 5;
    Integer n = 6;
    Integer i = 3;
    bst.insert(m);
    bst.insert(n);
    bst.insert(i);
    bst.display(bst.root);
  }
 
 */
}
