package AVL_Tree;

public class AVLClient 
{
 public static void main(String[] args) 
 {
  AVL_Tree tree = new AVL_Tree();
  
  tree.insert(20);
  tree.insert(25);
  tree.insert(30);
  tree.insert(10);
  tree.insert(5);
  tree.insert(15);
  tree.insert(27);
  tree.insert(19);
  tree.insert(16);
  
  System.out.println();
  tree.display();
  System.out.println();
 }
}
