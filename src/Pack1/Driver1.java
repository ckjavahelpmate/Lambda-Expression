package Pack1;


class A implements Trail1{

	@Override
	public void demo() {
		System.out.println("Implementation from A class");
		
	}
	
}

public class Driver1 {

	public static void main(String[] args) {
		
		// task1 :: Call demo() of Trail interface
				Trail1 t1=new A();
				t1.demo();
	}

}
