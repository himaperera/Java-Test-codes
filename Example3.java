import java.util.*;
class Example3{
	public static void main(String args[]){
		
		int [] ar = {10,20,30,40,50};
		int [] br = {10,20,30,40,50};
		int [] cr = {10,20,30};
		int [] dr = {10,20,30,40,50,60};
		int [] er = {10,20,30,40,50,60,70};
		
		System.out.println(Arrays.equals(ar,br));
		System.out.println(ar==br);
		System.out.println(Arrays.equals(ar,cr));
		System.out.println(Arrays.equals(ar,dr));
		System.out.println(Arrays.equals(ar,er));
		
		
		
		
		
	}
}