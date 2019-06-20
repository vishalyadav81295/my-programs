import java.util.LinkedList;
import java.util.Queue;


class BinaryTree {
    public static void main(String args[] ) throws Exception {
    	 Tree tr=new Tree();
    	 tr.insert(2);
    	 tr.insert(3);
    	 tr.insert(4);
    	 tr.insert(5);
    	 tr.insert(6);
    	 tr.insert(7);
    	/* tr.root=new Node(2);
    	 tr.root.leftptr=new Node(6);
    	 tr.root.rightptr=new Node(3);
    	 tr.root.leftptr.leftptr=new Node(4);
    	 tr.root.leftptr.rightptr=new Node(5);*/
    	tr.preordert(tr.root);
    	System.out.println(tr.search(tr.root,5));
    }
    }
  class Tree{Node root;
  public void insert(int a){
		Node node=new Node(a);
	Queue <Node>q= new LinkedList();
	        q.add(root);
	        if(root==null){
	        	root=node;
	        	
	        	return;
	        }
	        else   while(!q.isEmpty()){
	        	    Node tempnode=q.poll();
	        	    if(tempnode.leftptr==null | tempnode.rightptr==null){
	        	    	if(tempnode.leftptr==null){
	        	    		tempnode.leftptr=node;
	        	    		return;
	        	    	}
	        	    	else{
	        	    		tempnode.rightptr=node;
	        	    		return;
	        	    	}
	        	    }
	        	    else{
	        	    	q.add(tempnode.leftptr);
	        	    	q.add(tempnode.rightptr);
	        	    	
	        	    }
	        }
		
	}
  
 public static void preordert(Node r){
	 if(r==null){
		 return;
	 }
	 else{
		 System.out.print((r.d)+" ");
		 preordert(r.leftptr);
		 preordert(r.rightptr);
	 }
	 
 }
 public static boolean search(Node r,int a){
	 if(r==null){
		 return false;
	 }
	 else if(r.d==a){
		 return true;
	 }
	 else if(search(r.leftptr,a)|search(r.rightptr,a)){
		 return true;
	 }
	 return false;
 }
  }
        
	  
    class Node{
    	Node leftptr;
    	int d;
    	Node rightptr;
    	Node(int a){
    		 d=a;
    		leftptr=null;
    		rightptr=null;
    	}
    	  

    

}
