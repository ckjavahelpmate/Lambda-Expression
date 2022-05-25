package Pack1;

public class Driver2 {
	public static void main(String[] args) {
		
		
		// Task1 :: call demo() of Trail Interface
		
		
		Trail1 t1 = () -> {
			
			System.out.println("implementation from Lambda Expression");
		};
		t1.demo();
	}
}
