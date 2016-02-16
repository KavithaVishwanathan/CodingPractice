package mypracticepackage;

public class myBinaryTree {
  
  private TreeNode root;
  
  public void insert(Integer data) {
    if (this==null) {
      root = new TreeNode(data, null, null);
    } else {
      insertHelper(root, data);
    }
  }
  
  private void insertHelper(TreeNode root, Integer data){
    
  }
  /*
   * InnerClass for Nodes in the tree
   */
  public static class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;
    
    public TreeNode(Integer data, TreeNode left, TreeNode right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }
  
  public boolean isEmpty(){
    return (this == null);
  }
  
  public boolean isRoot(String element){
    
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
