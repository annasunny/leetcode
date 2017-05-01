public class CircularDoublyLinkedList {
    
    // change a Binary tree to circular doubly linked list
   public Node getCirculaDoublyLinkedListFromBinaryTree(Node root)
    {
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            root.left = root;
            root.right = root;
            return root;
        }
        Node left = getCirculaDoublyLinkedListFromBinaryTree(root.left);
        Node right = getCirculaDoublyLinkedListFromBinaryTree(root.right);
        
        Node node = root;
        if(left != null){
            node = join(left, node);
        }
        
        if(right != null){
            node = join(node, right);                         
        } 
        
        return node;
              
    }
    
    public Node join(Node a, Node b){
        
        //Node aHead = a;
        Node aTail = a.left;
        //Node bHead = b;
        Node bTail = b.left;
        
        aTail.right = b;
        b.left = aTail;
        
        a.left = bTail;
        bTail.right = a;
        
        return a;       
    }
    
    
    public class Node{
       int val;
       Node left;
       Node right;
       public Node(int v){
           val = v;
       }
    } 
    
}
