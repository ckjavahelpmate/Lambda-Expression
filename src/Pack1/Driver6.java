package Pack1;

public class Driver6 {

	public static void main(String[] args) {
		
		// task :: create an Array of square present array elements.
		
		   int[] a= {1, 2, 3, 4, 5};
		   
		   int[] b= Array.map(a, (x) -> x * x);//passing value as well as action to be performed on it.
		   
		   for(int y : a) System.out.print(y+", ");//old Array 
		   System.out.println();
		   for(int y : b) System.out.print(y+", ");// new Array
		   
		   
	}

}
