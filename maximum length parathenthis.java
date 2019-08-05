
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
       Scanner sc= new Scanner(System.in);
        
          
              String s[]=sc.nextLine().split("\\s");
               Stack<Integer> st=new Stack<Integer>();
               int max=0;
               int count=0;
               int turn=0;
              for(int j=0;j<s.length;j++){
                  
                  if(turn==0&&Integer.parseInt(s[j])<0){
                      if(st.isEmpty()){
                          
                      }
                      else{
                          turn =1;
                          if(st.peek()==-Integer.parseInt(s[j])){
                          count++;
                          st.pop();}
                          else{
                              st.clear();
                              turn=0;
                              if(count>max){
                                  max=count;
                                  
                              }
                          }
                      }
                  }
                 else if(turn==0&&Integer.parseInt(s[j])>0){
                     st.push(new Integer(s[j]));
                 }
                 else if(turn==1&&Integer.parseInt(s[j])<0){
                     if(st.peek()==-Integer.parseInt(s[j])){
                          count++;
                          st.pop();}
                           else{
                              st.clear();
                              turn=0;
                              if(count>max){
                                  max=count;
                                  
                              }
                          }
                 }
                 else{
                     turn=0;
                     st.clear();
                     if(count>max){
                                  max=count;
                                  
                              }
                               st.push(new Integer(s[j]));
                 }
              } if(count>max){
                                  max=count;
                                  
                              }
        System.out.print(2*max);  

    }
}
