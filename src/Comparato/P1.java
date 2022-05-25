package Comparato;

import java.util.Arrays;
import java.util.Comparator;


class Employee{
	String name;
	double sal;
	public Employee() {	}
	public Employee( String name, double sal) {
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		System.out.println("Employee name: "+name);
		System.out.println("Employee sal : "+sal);
		return "";
	}
}
class SortBy implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;	
		Employee e2=(Employee)o1;	
		return e1.name.compareTo(e2.name);
	}
	
}
public class P1 {
	public static void main(String[] args) {

		Employee[] emp= { new Employee("Sheela" ,10000) ,
				new Employee("Leela",5000),
				new Employee("Urmila",20000),
				new Employee("Mala",15000)};
		

			Arrays.sort(emp,(o1 ,o2) -> {
				Employee e1 = (Employee)o1;
				Employee e2 = (Employee)o2;
				return e2.name.compareTo(e1.name);
			});
			
			for(Employee e:emp)System.out.println(e);
			
	}
}
