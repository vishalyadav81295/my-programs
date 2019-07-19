/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	 String s= sc.nextLine();
	 char a[] =s.toCharArray();
	 Stack<Character>stk =new Stack<Character>();
	 String prefix ="";
	 for(int i=0;i<a.length;i++){
	     char temp=a[i];
	     
	     if(temp!='+'&&temp!='-'&&temp!='*'&&temp!='/'){
	         prefix =prefix+temp;
	         
	     }
	     else{
	         if(!stk.empty()){
	         
	         if(precedence(stk.peek().charValue())>=precedence(temp)){
	         while((!stk.empty())&&(precedence(stk.peek().charValue())>=precedence(temp))){
	             char b=stk.pop().charValue();
	             prefix =prefix+b;
	         }
	              stk.push(new Character(temp));
	         }}
	         else{
	         stk.push(new Character(temp));}
	     
	 }
	 
	}
	while(!stk.empty()){
	    prefix=prefix+(stk.pop().charValue());
	}
	System.out.println(prefix);    
	}
	public static int precedence(char c){
    	if((c=='*')||(c=='/')){
    		return 3;
    	}
    	else if((c=='+')||(c=='-')){
    		return 2;
    	}
    	else return -1;
    } 
}
