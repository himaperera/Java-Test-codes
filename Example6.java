import java.util.*;
class Example6{
	public static void main(String args[]){
		 int arr[][] = new  int[5][3]; //2D Array
		 
		arr[0][0] =1;
		arr[0][1] =10;
		arr[0][2] =4;
		arr[1][0] =5;
		arr[1][1] =6;
		arr[1][2] =8;
		arr[2][0] =2;
		arr[2][1] =12;
		arr[2][2] =14;
		arr[3][0] =79;
		arr[3][1] =25;
		arr[3][2] =69;
		arr[4][0] =24;
		arr[4][1] =11;
		arr[4][2] =61;
		
		
		
		
		for (int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(); 
		}
	}
}