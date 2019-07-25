import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of pyramid(odd number):");
		int n=sc.nextInt();
		int a=n/2;
		for(int i=0;i<=a;i++){
		for(int j=0;j<n;j++){
		if(j>=a-i&&j<=a+i){
		System.out.print(" * ");}
		else System.out.print("   ");
		}
		System.out.println();}
    }}
