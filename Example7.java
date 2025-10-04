import java.util.*;
class Example7{
	public static void main(String args[]){
		int arr[][] =new int[5][10]; //2D Array
		Random input = new Random();
		
		for (int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j]=input.nextInt(101);
				
			}
			
		}
		for (int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(); 
		}
	}
}