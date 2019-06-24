public class problem2{
public static void main(String arg[]){
	BinarySEarchTree bst=new BinarySEarchTree();
	bst.insert(5);
	bst.insert(54);
	bst.insert(2);
	bst.insert(8);
	bst.insert(56);
	bst.insert(9);
	bst.insert(10);
	//bst.inorderTraversal(bst.root);
	//System.out.print((bst.root.leftPtr));
	System.out.println(bst.howmanyNode(bst.root));
	System.out.print(bst.heightOfNode(bst.root));
}         
}
class BinarySEarchTree{
	Node root;
	
  public void insert(int a){
	  Node node =new Node(a);
	  if(root==null){
		 root=node;
		 return;
	  }
	  else{Node temp=root;
	  
		  while((temp!=null)){
			  
			  if(temp.d>a){
			      if(temp.leftPtr==null){
			    	  temp.leftPtr=node;
			    	  return;
			      }
			      else{temp=temp.leftPtr;}
			  }
			  else{
				  if(temp.rightPtr==null){
					  temp.rightPtr=node;
					  return;
				  }
				  else{temp=temp.rightPtr;}
			  }
		  }
		  
	  }
  }	
  public void inorderTraversal(Node temp){
	  if(temp==null){
		  return;
	  }
	  else{
		  inorderTraversal(temp.leftPtr);
		  System.out.print(temp.d+"  ");
		  inorderTraversal(temp.rightPtr);
	  }
  }
  
  public int howmanyNode(Node ptr){
	     if(ptr==null){
	    	 return 0;
	     }
	     else return 1+howmanyNode(ptr.leftPtr)+howmanyNode(ptr.rightPtr);
  }
  public int heightOfNode(Node ptr){
	  if(ptr==null){
		  return -1;
	  }
	  else{
		  if(heightOfNode(ptr.leftPtr)>heightOfNode(ptr.rightPtr)){
			  return 1+heightOfNode(ptr.leftPtr);
		  }
		  else{
			  return 1+heightOfNode(ptr.rightPtr);
		  }
		  
	  }
  }
  
	
}
class Node{
	Node leftPtr;
	int d;
	Node rightPtr;
	Node(int a){
		d=a;
		leftPtr=null;
		rightPtr=null;
	}
}
