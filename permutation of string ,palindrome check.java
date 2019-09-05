/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static String s1="";
	public static void main(String[] args) {
	    String s="cbaabc";
	    s1=s;
		perm(0,s,s.length()-1);
		System.out.print(s1);
	}

public static void perm(int str,String s,int len){
    if(str==len){
        if(palcheck(s)){
           if(s.compareTo(s1)<0) s1=s;
        }
    }
    else{
        for(int i=str;i<=len;i++){
            s=swap(s,str,i);
            perm(str+1,s,len);
            s=swap(s,i,str);
        }
    }
}
    public static String swap(String s,int f1,int f2 ){
        char a[]=s.toCharArray();
        char temp=a[f1];
           a[f1]=a[f2];
           a[f2]=temp;
           return String.valueOf(a);
    }
    public static boolean palcheck(String s){
           StringBuilder s2=new StringBuilder(s);
           StringBuilder s3=s2.reverse();
           String s4=s3.toString();
           if(s4.equals(s))
             return true;
            else return false; 
    }
        
}
