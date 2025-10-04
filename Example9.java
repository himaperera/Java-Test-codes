  import java.util.*;
class Example9{
	public static void main(String args[]){
		int[] arr = {5,2,9,1,5,6};
		
		for (int j=0; j<arr.length -1; j++){
			for (int i=0; i<arr.length -1-j; i++){
				if(arr[i] >arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]=temp;
				}
			} 
		}
		
		System.out.println(Arrays.toString(arr));
	
	}
}