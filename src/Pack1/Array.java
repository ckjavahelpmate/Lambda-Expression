package Pack1;

public class Array {

	// creating a new Array using passed array and the action to be performed on them.
	
	public static int[] map(int[] a, Function f) {
		
		int[] b= new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i]=f.func(a[i]);
		}
		return b;	
	}
	

}
