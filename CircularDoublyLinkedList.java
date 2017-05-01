public class CircularDoublyLinkedList {
    
    
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
        
        Node temptail;
        if(left != null){
            temptail = left.left;
            temptail.right = root;
            root.left = temptail;
            
        }
        
        if(right != null){
            root.right = right;
            temptail = right.left;
            right.left = root;
            temptail.right = left;
            left.left = temptail;
        }     
        if(left == null){
            return root;
        } else{
           return left; 
        }        
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
