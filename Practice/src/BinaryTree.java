import java.util.Arrays;


class Node {
	int value;
	Node left;
	Node right;
	
}

class Tree{
	Node root;
	
	 public Tree(){
		 root=null;
	 }
	 
	 public Node getNewNode(int value){
		 
		 Node n = new Node();
		 n.left=null;
		 n.right=null;
		 n.value=value;
		 
		 return n;
		 
	 }
	 
	 public void inorder(Node node){
		 if(node==null){
			 return;
		 }
		 
		 System.out.println(node.value+" ");


		 inorder(node.left);
		 
		 inorder(node.right);


	 }
	 
	 public Node insert(Node node, int value){
		 if(node==null){
			 return getNewNode(value);
		 }
		 
		 if(value<node.value){
			 node.left=insert(node.left, value);
			 //System.out.println("added in left "+value);
		 }else if (value>node.value){
			 node.right=insert(node.right, value);
			 //System.out.println("added in right "+value);

			 
		 }
		 
		 return node;
	}
	 
	public Node getNode(Node node, int value){
		if(node==null){
			return node;
		}
		
		while(node!=null){
			if(value<node.value){
				node=node.left;
			}else if(value>node.value){
				node=node.right;
			}else{
				return node;	
			}
				
			}
		
		return null;
		}
	
}



public class BinaryTree {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree a = new Tree();
		Node root=null;
		
		root = a.insert(root, 12); 
        root = a.insert(root, 5); 
        root = a.insert(root, 15); 
        root = a.insert(root, 3); 
        root = a.insert(root, 7); 
        root = a.insert(root, 8); 
        root = a.insert(root, 9); 
        root = a.insert(root, 13); 
        root = a.insert(root, 20); 
        a.inorder(root);
        
        Node n = a.getNode(root, 5);
        System.out.println("Node data "+n.value);

	

		
	}
}	
	
		
		
		