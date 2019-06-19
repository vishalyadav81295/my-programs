public class insertion{

	public static void main(String[] args) {
	int[] arr={4,16,8,9,3};
	int key,j;
	 for (int i=2;i<arr.length;i++){
	     key=arr[i];
	      j=i-1;
	     while((j>=0)&&(arr[j]>key) ){
	         arr[j+1]=arr[j];
	         j--;
	         	for(int x:arr)
	 System.out.print(x);
	     }
	     arr[j+1]=key;
	  System.out.println();   
	}
	for(int x:arr)
	 System.out.print(x);
	     
	 }

}
import java.util.Scanner;


class problem2 {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT*/

        
        Scanner s = new Scanner(System.in);
        System.out.print("enter exprestion : ");
         String expr=s.nextLine(); 
         
    
         

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
   public static String salve(String s1){
	   while((int t=findop(s1))!=-1){
		   s1=
	   }
   } 
   public static int findop(String s2){
	   int i=-1,pre=-1;
	   for(int j=0;j<s2.length();j++){
		   if(pre<precedence(s2.charAt(j))){
			   i=j;
			   pre=precedence(s2.charAt(j));
		   }
	   }
	   return i;
   }


}
