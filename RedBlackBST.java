///import java.util.Exceptions;
import java.util.NoSuchElementException;
public class RedBlackBST {

    private static final boolean RED   = true;
    private static final boolean BLACK = false;

    private Node root;     // root of the BST

    // BST helper node data type
    private class Node {
        private Line key;           // key
        private Integer val;         // associated data
        private Node left, right;  // links to left and right subtrees
             // color of parent link
        private Integer size;
        private Integer depth; 
                 // subtree count

        public Node(Line key, Integer val, int size) {
            this.key = key;
            this.val = val;
          
            this.size = size;
            
           
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public RedBlackBST() {
    }

   /***************************************************************************
    *  Node helper methods.
    ***************************************************************************/
    // is node x red; false if x is null ?
   

    // number of node in subtree rooted at x; 0 if x is null
    private int size(Node x) {
        if (x == null) return 0;
        return x.size;
    } 


    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return size(root);
    }

   /**
     * Is this symbol table empty?
     * @return {@code true} if this symbol table is empty and {@code false} otherwise
     */
    public boolean isEmpty() {
        return root == null;
    }


   /***************************************************************************
    *  Standard BST search.
    ***************************************************************************/

    
   
    public void put(Line key, Integer val) {
      


        root = put(root, key, val, 0);
        
        // assert check();
    }

    // insert the key-value pair in the subtree rooted at h
    private Node put(Node h, Line key, Integer val,Integer depth) { 
        if(key.a==key.b){
           
           }
        }
        if (h == null) return new Node(key, val,1);
        
        double cmp;
        if(key.inter(key,h.key)){
    
          h.left= put(h.left,key,val,depth+1);
          h.right=put(h.right,key,val,depth+1);
         
        }
        else{
        if(depth%2==0){
         cmp = -1*(h.key.a.x - key.a.x);
         }
         else  cmp = -1*(h.key.a.y - key.a.y); //key.compareTo(h.key);
        if      (cmp < 0) h.left  = put(h.left,  key, val,depth+1); 
        else if (cmp > 0) h.right = put(h.right, key, val,depth+1); 
        else              h.val   = val;
        }
        h.size = size(h.left) + size(h.right) + 1;
        return h;
    }
    


int epl() {
    if (root == null) return 0;
    else return epl(root);
}
int epl(Node root){
  if(root==null){
    return 0;
  }
return epl(root.left) + epl(root.right) + 1;
}     
public void printInOrder(){
     
      printInOrder(root);
    }

    public void printInOrder(Node root){
      if (root.val == null)
      return;
      if(root.left != null)
      printInOrder(root.left);
        
      System.out.println(root.val);
      if(root.right != null)
      printInOrder(root.right);
    }
    
public void printPreOrder(){
     
      printPreOrder(root);
    }

    public void printPreOrder(Node root){
      if (root.val == null)
      return;
      if(root.left != null)
      System.out.println(root.val);
      printPreOrder(root.left); 
      if(root.right != null)
      printPreOrder(root.right);
    }
 /*void compare(Point a,Point b){
   Queue patha = new Queue();
   patha.enqueue(root.val);
  patha = compare(root,a,patha);
 
  
  Queue pathb = new Queue();
  pathb.enqueue(root.val);
  pathb = compare(root, b,pathb);
  while(!pathb.isEmpty()){
    if(patha.dequeue() != pathb.dequeue()){
      System.out.println("Not in same region; Line " + patha.dequeue().toString() + " is between them");
      return;
     }
    
    
     
  }
  System.out.println("In same region");
  }
 */

 


/*Queue compare(Node node, Point a,Queue path){
  if(node == null) return path;
  if (ccw(node.key.a,node.key.b,a) == 1){
  path.enqueue(node.v);
  node = node.left;
  return compare(node.left, a,path);
  }
 if (ccw(node.key.a,node.key.b,a) == -1){ 
  path.enqueue(node.val);
  node = node.right;
  return compare(node.right, a,path);
}

return path;
  }
  
  /*void compare(Point a,Point b){
    Line l = new Line(a,b);
    compare(l,-3);
  }
  public void compare(Line key, Integer val) {
    Line temp = key;
      


        root = compare(root, key, val, 0);
        if(key.inter(temp,root.key)){
        System.out.println("Not in same region; Line " + root.val + " is between them");
        }
        else System.out.println("In same region.");
        // assert check();
    }
  private Node compare(Node h, Line key, Integer val,Integer depth) { 
        
        if (h == null) return null;
        double cmp;
        if(key.inter(key,h.key)){
          
          return h;
        }
        else{
        if(depth%2==0){
         cmp = -1*(h.key.a.x - key.a.x);
         }
         else  cmp = -1*(h.key.a.y - key.a.y); //key.compareTo(h.key);
        if      (cmp < 0) h.left  = put(h.left,  key, val,depth+1); 
        else if (cmp > 0) h.right = put(h.right, key, val,depth+1); 
        else              h.val   = val;
        }
        h.size = size(h.left) + size(h.right) + 1;
        return h;
    }
   */ 

public int ccw(Point p0, Point p1, Point p2) {
 Double dx1 = p1.x - p0.x;
 Double dy1 = p1.y - p0.y;
 Double dx2 = p2.x - p0.x;
 Double dy2 = p2.y - p0.y;
 if (dx1*dy2 > dy1*dx2) return 1;
 else if (dx1*dy2 < dy1*dx2) return -1;
 else if ((dx1*dx2 < 0) || (dy1*dy2 < 0)) return -1;
 else if ((dx1*dx1+dy1*dy1) < (dx2*dx2+dy2*dy2)) return 1;
 else return 0;
}
   

}

 /*
0.95 0.10 0.11 0.50
0.95 0.10 0.11 0.50

 */

