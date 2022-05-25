package Pack1;

import java.util.Scanner;

public class Driver4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		
		Trail3 t1 = (n	,	m)	->	{
			while(n<=m) {
				if(n%2==0)
					System.out.println(n);
				n++;
			}
		};
		t1.even(a,b);
	}

}
