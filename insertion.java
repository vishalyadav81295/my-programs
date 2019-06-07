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
