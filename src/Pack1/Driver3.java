package Pack1;

public class Driver3 {

	public static void main(String[] args) {
		
		int a=10	,	b=20;
		// task :: call demo(int,int) of trail2 interface.
		
		Trail2 t1= (x,y) -> {
			System.out.println("Result: "+(x+y));
		};
		
		t1.add(a,b);
	}

}
