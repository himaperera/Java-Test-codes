import java.util.*;
class Example8{
	public static void main(String args[]){
		int arr[][] =new int[5][10]; //2D Array
		Random input = new Random();
		
		for (int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j]=input.nextInt(101);
				
			}
			
		}
		
			System.out.println(Arrays.deepToString(arr)); 
		}
	}
