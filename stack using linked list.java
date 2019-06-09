public class Main
{
	public static void main(String[] args) {
		stack sk=new stack();
		sk.push(10);
		sk.push(13);
		sk.push(3);
		sk.printvalues();
		System.out.println(sk.pop());
		sk.printvalues();
	}
}
class stack{
    node top;
    class node{
        int data;
        node next;
        node(int a){
            data=a;
            next=null;
        }
        }
         public void push(int a){
            node newnode=new node(a);
            newnode.next=top;
            top=newnode;
            
        }
        public void printvalues(){
            node temp=top;
            if(temp==null){System.out.println("it is empty.");}
            else while(temp!=null){
              System.out.print(temp.data+" "); 
              temp=temp.next;
            }
        }
        public int pop(){
            if(top==null){System.out.println("Stack is underflow");
                System.exit(0);
            }
            int a=top.data;
            top=top.next; 
            return a;
            
        }
    }
